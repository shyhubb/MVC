package shyhub.vn.hub.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashBoardController {
    @GetMapping("/admin")
    public String getDashBorad() {
        return "admin/dashboard";
    }
}
