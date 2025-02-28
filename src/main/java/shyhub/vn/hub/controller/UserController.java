package shyhub.vn.hub.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shyhub.vn.hub.domain.User;
import shyhub.vn.hub.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

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
        System.out.println(userService.findUserById("shy@gmail.com"));
        return "index";
    }

    @GetMapping("/admin/user")
    public String logForm(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/register", method = RequestMethod.POST) // ham controller xu li dang ki
    public String hehe(Model model, @ModelAttribute("newUser") User user) {
        this.userService.handUser(user); // goi den method handel cua lop UserServie
        return "index";
    }

    @GetMapping("/admin/user/view")
    public String getMethodName(Model model) {
        List<User> users = userService.getUser(); // Đảm bảo tên phương thức đúng
        model.addAttribute("users", users); // Tên attribute trong model nên viết thường
        return "admin/user/viewuser";
    }

}
