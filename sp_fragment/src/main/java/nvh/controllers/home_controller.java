package nvh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home_controller {

    @GetMapping("/")
    public String homePage() {
        return "pages/index"; 
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "pages/about"; 
    }
}