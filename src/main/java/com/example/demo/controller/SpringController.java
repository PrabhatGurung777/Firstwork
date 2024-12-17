package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
		
		@GetMapping("/dummyData")
		public String getResponse() {
			return "Update To Hi!!!";
		}

	}
