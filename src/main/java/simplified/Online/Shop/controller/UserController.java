package simplified.Online.Shop.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import simplified.Online.Shop.dto.User;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public String showRegister(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "register";
    }

    @RequestMapping("/register/process")
    public String processRegister(@Valid @ModelAttribute("user") User data, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "showRegister";
        }
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            System.out.println("Creating new Object");
            User user = new User(data.getName(),data.getEmail(),data.getPassword());
            session.beginTransaction();
            System.out.println("Saving....");
            session.save(user);
            session.getTransaction().commit();
            System.out.println("DONE!");

        }finally {
            sessionFactory.close();
        }
        return "login";
    }

}
