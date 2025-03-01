package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void writeSomeData() {
		
		template.send("Money-Transaction","Transaction of INR 200000 has been made ");
		
	}

}
