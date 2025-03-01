package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class KafkaController {
	
	@Autowired
	private KafkaService service;
	
	
	@GetMapping("/execute")
	public void call() {
		service.writeSomeData();
	}

	@GetMapping("/getall")
	public void getdata() {
		service.writeSomeData();
	}
}
