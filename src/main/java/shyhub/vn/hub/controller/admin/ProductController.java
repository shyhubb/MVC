package shyhub.vn.hub.controller.admin;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
    @GetMapping("/admin/product")
    public String viewProduct() {
        return "admin/product";
    }

}
