package com.insurance.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.claim.Interface.PolicyClient;
import com.insurance.claim.dto.PolicyDTO;
import com.insurance.claim.entity.Claim;
import com.insurance.claim.repository.ClaimRepository;

@Service
public class ClaimServiceImpl implements ClaimService {

	
	
	    
	    @Autowired
	    private ClaimRepository repository;

	    
	    @Autowired
	    private PolicyClient policyclient; 
	    
	    
	    @Override
	    public Claim createClaim(Claim claim) {
	        return repository.save(claim);
	    }
	    
	    
	    
	    public void validatePolicyBeforeClaim(Long PolicyId) {
	    	
	    	PolicyDTO policy = policyclient.getPolicyById(PolicyId);
	    	System.out.println("policy fetched" + policy.getPolicyHolderName());
	    }
	    
	    
	    

	    @Override
	    public Claim getClaimById(Long id) {
	        return repository.findById(id).orElseThrow();
	    }

	    @Override
	    public List<Claim> getAllClaims() {
	        return repository.findAll();
	    }

	    @Override
	    public List<Claim> getClaimsByPolicyId(Long policyId) {
	        return repository.findByPolicyId(policyId);
	    }

	    @Override
	    public Claim updateClaim(Long id, Claim updatedClaim) {
	        Claim existing = repository.findById(id).orElseThrow();
	        existing.setClaimNumber(updatedClaim.getClaimNumber());
	        existing.setDescription(updatedClaim.getDescription());
	        existing.setClaimAmount(updatedClaim.getClaimAmount());
	        existing.setClaimDate(updatedClaim.getClaimDate());
	        existing.setPolicyId(updatedClaim.getPolicyId());
	        return repository.save(existing);
	    }

	    @Override
	    public void deleteClaim(Long id) {
	        repository.deleteById(id);
	    }
	}

