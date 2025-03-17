package nvh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; 
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username, 
                               @RequestParam("password") String password, 
                               Model model) {
        if ("user".equals(username) && "password".equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Sai tên người dùng hoặc mật khẩu.");
            return "login"; 
        }
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; 
    }
}