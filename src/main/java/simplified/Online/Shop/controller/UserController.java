package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import simplified.Online.Shop.dto.User;
import simplified.Online.Shop.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    User user;

    @RequestMapping("/register")
    public String showRegister(Model model){
        System.out.println(user.getEmail());
        model.addAttribute("user",user);
        return "register";
    }

    @RequestMapping("/register/process")
    public String processRegister(@ModelAttribute("user") User data, Model model){
        user=data;
        userService.createUser(user);
        user.setId(0);user.setPassword("");user.setEmail("");user.setName("");
        return "redirect:/login";
    }

    @RequestMapping("/edit")
    public String showEditProfile(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        System.out.println("pas di edit1 :"+user);
        model.addAttribute("user",user);
        System.out.println("pas di edit2 :"+user.getId());
        return "editProfile";
    }
    @RequestMapping("/edit/process")
    public String processEditProfile(@ModelAttribute("user") User data, Model model){
        System.out.println("pas lagi proses1 : "+user.getName());
        user.setName(data.getName());
        user.setEmail(data.getEmail());
        user.setPassword(data.getPassword());
        System.out.println("pas lagi proses2 : "+user.getName());
        userService.updateUser(user);
        System.out.println(user.getEmail());
        return "redirect:/dashboard";
    }


}
