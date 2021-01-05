package com.cybage.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/main")
public class MainController {
	
	@GetMapping("/hello")
	public String test()
	{
		return "Hello World";
	}

}
