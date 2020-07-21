package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/hello")
	public  static String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/sum")
	public static int  sum() {
		return 10+20;
	}

	@GetMapping("/multiply")
	public static int  multiply() {
		return 10*20;    // returns a interger
	}
}
