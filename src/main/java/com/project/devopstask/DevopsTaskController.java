package com.project.devopstask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsTaskController {
	
	@GetMapping(value="/get") 
	public String get() {
		return "Exhausted";
	}
	

}
