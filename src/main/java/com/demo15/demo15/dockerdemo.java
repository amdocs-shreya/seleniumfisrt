package com.demo15.demo15;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class dockerdemo {
	@GetMapping("/get")
	public String show() {
		return "Welcome To Amdocs";
	}
	@GetMapping("/in")
	public String show1() {
		return "We are going to dockerize springboot application";
	}
	}



