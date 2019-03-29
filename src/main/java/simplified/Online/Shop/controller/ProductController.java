package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    Product product;
    @Autowired
    ProductService productService;

    @RequestMapping("/{id}")
    public String showDetailProduct(@PathVariable int id, Model model){
        model.addAttribute("product",productService.getOneProduct(id));
        return "productDetail";
    }
}
