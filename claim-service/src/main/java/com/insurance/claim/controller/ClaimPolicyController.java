package com.insurance.claim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.claim.Interface.PolicyClient;
import com.insurance.claim.dto.PolicyDTO;
import com.insurance.claim.entity.Claim;
import com.insurance.claim.service.ClaimService;

@RestController
@RequestMapping("/api/claims")
public class ClaimPolicyController {

	 @Autowired
	    private ClaimService claimService;
	 
	 @Autowired
	 private PolicyClient policyclient;
	 
	 
	 
	 @GetMapping("/test-policy/{id}")
	 public ResponseEntity<String> testPolicyCall(@PathVariable Long id) {
	     PolicyDTO policy = policyclient.getPolicyById(id);
	     return ResponseEntity.ok("Policy Holder Name: " + policy.getPolicyHolderName());
	 }


	    @PostMapping
	    public ResponseEntity<Claim> createClaim(@RequestBody Claim claim) {
	        return ResponseEntity.ok(claimService.createClaim(claim));
	    }

	    @GetMapping
	    public ResponseEntity<List<Claim>> getAllClaims() {
	        return ResponseEntity.ok(claimService.getAllClaims());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Claim> getClaimById(@PathVariable Long id) {
	        return ResponseEntity.ok(claimService.getClaimById(id));
	    }

	    @GetMapping("/policy/{policyId}")
	    public ResponseEntity<List<Claim>> getClaimsByPolicy(@PathVariable Long policyId) {
	        return ResponseEntity.ok(claimService.getClaimsByPolicyId(policyId));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Claim> updateClaim(@PathVariable Long id, @RequestBody Claim claim) {
	        return ResponseEntity.ok(claimService.updateClaim(id, claim));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteClaim(@PathVariable Long id) {
	        claimService.deleteClaim(id);
	        return ResponseEntity.noContent().build();
	    }
}
