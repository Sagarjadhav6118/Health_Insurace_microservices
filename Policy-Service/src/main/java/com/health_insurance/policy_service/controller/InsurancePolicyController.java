package com.health_insurance.policy_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health_insurance.policy_service.entity.InsurancePolicy;
import com.health_insurance.policy_service.service.InsurancePolicyService;
import com.health_insurance.policy_service.service.PolicyEventProducer;

@RestController
@RequestMapping("/api/policies")
public class InsurancePolicyController {
	 @Autowired
	    private InsurancePolicyService policyService;
	 
	 @Autowired
	 PolicyEventProducer policyEventProducer;
	 
	 
	 public InsurancePolicyController(PolicyEventProducer policyEventProducer) {
	        this.policyEventProducer = policyEventProducer;
	    }
	 
	 
	 
	 

	    @PostMapping
	    public ResponseEntity<InsurancePolicy> createPolicy(@RequestBody InsurancePolicy policy) {
	      policyEventProducer.sendPolicyCreatedEvent("Policy created with ID: " + policy.getId());

	        return new ResponseEntity<>(policyService.createPolicy(policy), HttpStatus.CREATED);
	        
	    }
	    
//	    @PostMapping("/{Id}")
//	    public ResponseEntity<InsurancePolicy> createPolicyById(@RequestBody InsurancePolicy policy, @PathVariable Long id) {
//	    	return new policyEventProducer.sendPolicyCreatedEvent("Policy created with ID: " + policy.getId());
//
//	        
//	    }

	    @GetMapping
	    public ResponseEntity<List<InsurancePolicy>> getAllPolicies() {
	        return ResponseEntity.ok(policyService.getAllPolicies());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<InsurancePolicy> getPolicyById(@PathVariable Long id) {
	        return ResponseEntity.ok(policyService.getPolicyById(id));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<InsurancePolicy> updatePolicy(@PathVariable Long id, @RequestBody InsurancePolicy policy) {
	        return ResponseEntity.ok(policyService.updatePolicy(id, policy));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletePolicy(@PathVariable Long id) {
	        policyService.deletePolicy(id);
	        return ResponseEntity.noContent().build();
	    }
}
