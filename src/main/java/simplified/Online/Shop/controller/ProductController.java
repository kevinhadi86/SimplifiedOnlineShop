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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showDetailProduct(@PathVariable int id, Model model){
        Product product = productService.getOneProduct(id);
        model.addAttribute("product",product);
        model.addAttribute("productOwner",userService.getUserById(product.getOwner()).getName());
        return "productDetail";
    }
    @RequestMapping("/add/form")
    public String showAddProductForm(Model model){
        product=new Product();
        model.addAttribute("product",product);
        return "productForm";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product data, HttpServletRequest request){
        HttpSession session = request.getSession();
        product=data;
        User user = (User) session.getAttribute("user");
        product.setOwner(user.getId());
        productService.createProduct(product);
        System.out.println(product.toString());
        return "redirect:/myProduct";
    }
    @RequestMapping("/update/form/{id}")
    public String showUpdateProductForm(@PathVariable int id, Model model){
//        boleh nih nanti dibikin checknya, dia ada ga productnya, pake method baru jadi dia bisa hidden urlnya ntr
        product=productService.getOneProduct(id);
        model.addAttribute("product",product);
        return "productUpdateForm";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute("product") Product data){
        product.setName(data.getName());
        product.setDescription(data.getDescription());
        product.setPrice(data.getPrice());
        product.setStock(data.getStock());
        productService.updateProduct(product);
        System.out.println(product.toString());
        return "redirect:/myProduct";
    }
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "redirect:/myProduct";
    }
}
