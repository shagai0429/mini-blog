package mn.shagai.miniblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "nuur";
	}

	@RequestMapping("/tuhai1")
	public String tuhai1() {
		return "tuhai1";
	}
	
	@RequestMapping("/tuhai2")
	public String tuhai2() {
		return "tuhai2";
	}
	
	@RequestMapping("/tuhai3")
	public String tuhai3() {
		return "tuhai3";
	}
}
