package shyhub.vn.hub.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shyhub.vn.hub.domain.User;
import shyhub.vn.hub.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("/admin/user/register") // Xử lý đăng ký
    public String registerUser(@ModelAttribute("newUser") User user) {
        userService.handUser(user); // Gọi phương thức xử lý user
        return "redirect:/admin/user/view"; // Chuyển hướng về trang danh sách user | khong redirect se bi miss data
    }

    @GetMapping("/admin/user/view")
    public String getMethodName(Model model) {
        List<User> users = userService.getUser(); // Đảm bảo tên phương thức đúng
        model.addAttribute("users", users); // Tên attribute trong model nên viết thường
        return "admin/user/viewuser";
    }

    @GetMapping("/admin/user/show/{id}")
    public String showUser(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        User user = this.userService.findById(id);
        model.addAttribute("user", user);
        return "admin/user/show"; // Hiển thị thông tin user trên trang view
    }

    @GetMapping("/admin/user/update/{id}")
    public String updateUser(Model model, @PathVariable long id) {
        // Tìm kiếm user theo id
        User user = this.userService.findById(id);

        // Thêm đối tượng User vào model với tên "Userupdate"
        model.addAttribute("Userupdate", user);
        System.out.println(user);

        // Trả về view cập nhật thông tin người dùng
        return "/admin/user/update";
    }

    @PostMapping("/admin/user/update") // Xử lý đăng ký
    public String updateUser(@ModelAttribute("Userupdate") User user) {
        userService.handUser(user);
        return "redirect:/admin/user/view"; // Chuyển hướng về trang danh sách user | khong redirect se bi miss data
    }

    @PostMapping("/admin/user/delete/{id}")
    public String deleteUser(Model model, @PathVariable long id) {
        try {
            userService.deleteById(id);
            model.addAttribute("message", "User deleted successfully.");
        } catch (Exception e) {
            model.addAttribute("error", "Error deleting user.");
        }
        return "redirect:/admin/user/view";
    }

}
