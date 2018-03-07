package abc.myProject.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {
	@RequestMapping("/403Error")
	public String Error() {
		return "403";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("adminhome")
	public String adminhome(){
		return "adminhome";
	}
	@RequestMapping("/") public String home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}



}