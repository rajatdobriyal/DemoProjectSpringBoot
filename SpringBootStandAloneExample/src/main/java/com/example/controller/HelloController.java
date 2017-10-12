package main.java.com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String home(ModelMap model){
		model.addAttribute("title","Dear Rajat");
		model.addAttribute("message","Welcome to SpringBoot");
		return "hello";	
	}
}