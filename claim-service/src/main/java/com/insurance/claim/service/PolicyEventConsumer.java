package com.insurance.claim.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PolicyEventConsumer {
	
	 @KafkaListener(topics = "policy-events", groupId = "claim-group")
	    public void consume(String message) {
	        System.out.println("📩 Claim Service received event: " + message);
	    }
	

}
