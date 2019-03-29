package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import simplified.Online.Shop.dto.User;
import simplified.Online.Shop.service.ProductService;
import simplified.Online.Shop.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    UserService userService;
    @Autowired
    User user;
    @Autowired
    ProductService productService;



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(){
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(Model model){

        model.addAttribute("user",user);
        return "login";
    }

    @RequestMapping(value = "/login/process", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User data, Model model, HttpServletRequest request){
        User resultData = userService.findEmailAndPassword(data);
        if (resultData != null){
            user=resultData;
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            model.addAttribute("user", user);
            return "redirect:/dashboard";
        }else{
            return "redirect:/login";
        }
    }

    @RequestMapping("/dashboard")
    public String showDashboard(Model model){
        model.addAttribute("products",productService.getAllOthersProduct(user.getId()));
        return "dashboard";
    }
    @RequestMapping("/myProduct")
    public String showMyProduct(Model model){
        model.addAttribute("products",productService.getAllMyProduct(user.getId()));
        return "myProduct";
    }


}
