package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import simplified.Online.Shop.dto.CartItem;
import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.dto.Transaction;
import simplified.Online.Shop.dto.User;
import simplified.Online.Shop.service.ProductService;
import simplified.Online.Shop.service.TransactionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TransactionController {

    List<CartItem> items;

    @Autowired
    Transaction transaction;
    @Autowired
    ProductService productService;
    @Autowired
    TransactionService transactionService;
    @Autowired
    Product product;
    @Autowired
    CartItem cartItem;

    public TransactionController() {
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    /**
     * Setter method for property cartItem.
     *
     * @param cartItem value to be assigned to property cartItem
     */
    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    @RequestMapping("/history")
    public String getAllMyTransaction(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        model.addAttribute("transactions", transactionService.getAllTransactionByBuyerId(user.getId()));
        System.out.println(transactionService.getAllTransactionByBuyerId(user.getId()));
        return "transactionHistory";
    }

    @RequestMapping("/cart")
    public String showCart(Model model) {
        model.addAttribute("transaction", transaction);
        return "cart";
    }

    @RequestMapping("/addItemToCart/{id}")
    public String addItemToCart(@PathVariable int id, HttpServletRequest request) {
        product = productService.getOneProduct(id);
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        createNewItem(product,quantity);
        transaction.addItemToList(cartItem);
        transaction.setTotalPrice(transaction.getTotalPrice()+cartItem.getProductPrice());
        return "redirect:/cart";
    }
    public void createNewItem(Product product, int quantity){
        cartItem.setId(0);
        cartItem.setTransactionId(0);
        System.out.println(product);
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
    }

    @RequestMapping("/checkout")
    public String createTransaction(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        transaction.setBuyerId(user.getId());
        transactionService.createTransaction(transaction);
        transaction = new Transaction();
        return "redirect:/dashboard";
    }
}
