package shyhub.vn.hub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import shyhub.vn.hub.domain.User;
import shyhub.vn.hub.service.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showView(Model model) {
        String res = userService.Handdelhello();
        model.addAttribute("eric", res);
        model.addAttribute("pi", 3.14);
        return "index";
    }

    @GetMapping("/admin/user")
    public String logForm(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/register", method = RequestMethod.POST)
    public String hehe(Model model, @ModelAttribute("newUser") User user) {
        System.out.println("post" + user);
        return "index";
    }

}
