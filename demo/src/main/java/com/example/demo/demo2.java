package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class demo2

	{
//	@Value("${message}")
//	private String msg;
	
	@Value("101")
	private String msg;
	
	@GetMapping("/ab")
	
	public String Hello()
	{
	return msg ;
	}
}