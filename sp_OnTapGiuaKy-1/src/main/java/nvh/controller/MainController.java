package nvh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home - Spring Boot Admin");
        return "home"; // Đảm bảo trùng với tên file template
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About Us - Spring Boot Admin");
        return "about";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("pageTitle", "Item List - Spring Boot Admin");
        List<String> items = Arrays.asList("Spring Boot", "Spring Security", "Thymeleaf", "Bootstrap", "Admin Server");
        model.addAttribute("items", items);
        return "list";
    }
}