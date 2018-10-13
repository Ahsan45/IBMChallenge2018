package ibm.cai.challenge.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import ibm.cai.challenge.model.User;
import ibm.cai.challenge.repo.UserRepository;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class UserController implements WebMvcConfigurer{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userForm(Model model){
        model.addAttribute("user", new User());
        return "user";
    }

    @PostMapping("/user")
    public String checkPersonInfo(@ModelAttribute @Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "user";
        }

        return "result";
    }




}