package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalcService;

@RestController
@RequestMapping("/calci")
public class CalcController {
	@Autowired
	private CalcService service;
	
	//Addition - RequestParam
	// URL : http://localhost:8080/calci/add?a=10&b=5
	@RequestMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a,b);
	}
	
	//Subctraction - PathVariable
	// URL : http://localhost:8080/calci/add?a=10&b=5
	@RequestMapping("/sub/{a}/{b}")
	public int sub(@PathVariable int a, @PathVariable int b) {
		return service.sub(a,b);
	}
	
	
	@RequestMapping("/mul/{a}/{b}")
	public int mult(@PathVariable int a, @PathVariable int b) {
		return service.mult(a,b);
	}
	
	@RequestMapping("/div")
	public double div(@RequestParam int a, @RequestParam int b) {
		return service.div(a,b);
	}
	
	@RequestMapping("/mod")
	public int mod(@RequestParam int a, @RequestParam int b) {
		return service.mod(a,b);
	}
	
	
	
	
}