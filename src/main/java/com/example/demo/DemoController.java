package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String hello()
	{
		return "server is working";
	}
	
	@RequestMapping
	public String testMethod()
	{
		return "hello Satyam site is under progress" ;
	}
}
