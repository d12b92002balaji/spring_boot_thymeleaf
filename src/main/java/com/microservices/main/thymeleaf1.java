package com.microservices.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleaf1 {
	
	@GetMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("message", "hello worlds");
		return "index";
	}
}
