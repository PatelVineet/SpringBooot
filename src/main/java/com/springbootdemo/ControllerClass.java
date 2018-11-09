package com.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/Hay")
	public String returnHello(){
		System.out.println("Inside hay");
		return "Greetings!!!";
	}
}
