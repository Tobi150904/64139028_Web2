package nvh.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class demoController {
	@GetMapping("/hi")
	public String Index() {
		return "index";
	}
}
