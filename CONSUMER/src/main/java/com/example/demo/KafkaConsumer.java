package com.example.demo;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Money-Transaction", groupId = "my-group")
    public void readData(String info) {
        System.out.println("Received message: " + info);
    }
}
