package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// http://127.0.0.1:8080/hello
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	// http://127.0.0.1:8080/userinfo
	@RequestMapping("/userinfo")
	public HashMap<String, String> userinfo()
	{
		HashMap<String, String> map = new HashMap<String, String>(); 
		map.put("name", "김원필");
		map.put("age", "31");
		return map;
	}
}
