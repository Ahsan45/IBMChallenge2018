package ibm.cai.challenge.controllers;

import ibm.cai.challenge.model.User;
import ibm.cai.challenge.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
    
    @Autowired
    IUserService userService;

    @RequestMapping("/showUsers")
    public String findUsers(Model model) {
        
        List<User> users = (List<User>) userService.findAll();
        
        model.addAttribute("user", users);
        
        return "showUsers";
    }
}