package shyhub.vn.hub.controller.admin;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AdminUserController {
    @GetMapping("/admin/user/viewuser")

    public String viewUser() {
        return "admin/user";
    }
}
