package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/hi")
	public String sayHello()
	{
		return "hi Abdo";
	}
	
	@GetMapping("/getName")
	public String getName()
	{
		return "My name is Omar";
	}

}
