package com.mysite.HR.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HR_Controller {
	@GetMapping("/HR2")
	@ResponseBody
	public String HR2() {
		return "다시 만든 HR2";
	}
}
