package shyhub.vn.hub.controller.admin;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class OderController {
    @GetMapping("/admin/oder")
    public String viewOder() {
        return "admin/oder";
    }
}
