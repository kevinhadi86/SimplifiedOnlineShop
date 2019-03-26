package simplified.Online.Shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import simplified.Online.Shop.dto.User;
import simplified.Online.Shop.service.LoginService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @Autowired
    LoginService loginService;

    /**
     * Getter method for property loginService.
     *
     * @return property value of loginService
     **/
    public LoginService getLoginService() {
        return loginService;
    }

    /**
     * Setter method for property loginService.
     *
     * @param loginService value to be assigned to property loginService
     */
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/login")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/login/process")
    public String login(HttpServletRequest request){
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        if (loginService.findEmailAndPassword(user)!=null){
            return "redirect:/dashboard";
        }

        return "redirect:/";

    }

    @RequestMapping("/dashboard")
    public String showDashboard(){
        return "dashboard";
    }


}
