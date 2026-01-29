package com.klu.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "this is spring boot demo application";
	}
	@GetMapping("/bye")
	public String sayBye() {
		return "Have a Good Day";
	}
	
}
