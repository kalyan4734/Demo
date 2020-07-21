package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/hello")
	public  static String sayHello() {
		return "Hello World"; // returns a string
	}
	
	@GetMapping("/sum")
	public static int  sum() {
		return 10+20;
	}

	@GetMapping("/multiply")
	public static int  multiply() {
		return 10*20;    // returns a interger
	}
	
	@GetMapping("/mod")
	public static int  mod() {
		return 20%10;   
	}
	
	@GetMapping("/sub")
	public static int  sub() {
		return 20-10;   
	}
	
	@GetMapping("/div")
	public static int  div() {
		return 20/10;   
	}
}
