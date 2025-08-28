package com.insurance.claim.service;

import java.util.List;

import com.insurance.claim.entity.Claim;

public interface ClaimService {

	
	 Claim createClaim(Claim claim);
	    Claim getClaimById(Long id);
	    List<Claim> getAllClaims();
	    List<Claim> getClaimsByPolicyId(Long policyId);
	    Claim updateClaim(Long id, Claim claim);
	    void deleteClaim(Long id);
}
