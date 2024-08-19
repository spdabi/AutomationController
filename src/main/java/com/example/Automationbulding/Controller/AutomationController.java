package com.example.Automationbulding.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {
	
	@GetMapping(value="/getAuto")
	public String getthis() {
		return "hello docker";
	}

}
