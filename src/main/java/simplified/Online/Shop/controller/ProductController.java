package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.dto.User;
import simplified.Online.Shop.service.ProductService;
import simplified.Online.Shop.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    Product product;
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public String showDetailProduct(@PathVariable int id, Model model){
        model.addAttribute("product",productService.getOneProduct(id));
        return "productDetail";
    }
    @RequestMapping("/new/form")
    public String showNewProductForm(Model model){
        model.addAttribute("product",product);
        return "productForm";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNewProduct(@ModelAttribute("product") Product data, HttpServletRequest request){
        HttpSession session = request.getSession();
        product=data;
        User user = (User) session.getAttribute("user");
        System.out.println(user.getId());
        product.setOwner(userService.getUserById(user.getId()).getName());
        System.out.println("hehehehe");
        productService.createProduct(product);
        System.out.println(product.toString());
        return "redirect:/myProduct";
    }
}
