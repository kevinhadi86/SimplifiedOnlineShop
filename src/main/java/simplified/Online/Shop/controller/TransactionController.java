package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.service.ProductService;

import java.util.List;

@Controller
public class TransactionController {

    private List<Product> items;

    @Autowired
    ProductService productService;
    @Autowired
    Product product;

    public TransactionController() {
    }

    /**
     * Getter method for property items.
     *
     * @return property value of items
     **/
    public List<Product> getItems() {
        return items;
    }

    /**
     * Setter method for property items.
     *
     * @param items value to be assigned to property items
     */
    public void setItems(List<Product> items) {
        this.items = items;
    }

    @RequestMapping("/addItemToCart/{id}")
    public String addItemToCart(@PathVariable int id){
        product=productService.getOneProduct(id);
        return "redirect:/dashboard";
    }
}
