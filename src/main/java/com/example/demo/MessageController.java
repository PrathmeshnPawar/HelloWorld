package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping("/")
	public String display() {
		return "Spring boot is running!!!";
	}
}
