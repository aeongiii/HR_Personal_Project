package com.mysite.HR.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/HR3")
	@ResponseBody
	public String index() {
		return "index";
	}
}
