package com.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/myapp")
public class CounterController {
	
	private static int count = 0;
	
	@GetMapping(value="/increment", produces=MediaType.APPLICATION_JSON_VALUE)
	public String increment() {
		count++;
		System.out.println("INCREMENT: " + count);
		return "{\"count\":" + count + "}";
	}
	
	@GetMapping(value="/decrement", produces=MediaType.APPLICATION_JSON_VALUE)
	public String decrement() {
		count--;
		System.out.println("DECREMENT: " + count);
		return "{\"count\":" + count + "}";
	}
}
