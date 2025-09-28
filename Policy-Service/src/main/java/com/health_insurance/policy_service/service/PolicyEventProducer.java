package com.health_insurance.policy_service.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PolicyEventProducer {
	
	
	private static final String TOPIC = "policy-events";
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public PolicyEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
		
	}
	
	
	public void sendPolicyCreatedEvent(String message) {
		kafkaTemplate.send(TOPIC , message);
		System.out.println("Sent Policy Event:"+ message);
		
	}
	
}
