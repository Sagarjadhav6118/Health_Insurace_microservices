package com.insurance.claim.service.fallback;

import org.springframework.stereotype.Component;

import com.insurance.claim.Interface.PolicyClient;
import com.insurance.claim.dto.PolicyDTO;

@Component
public class PolicyClientfallback implements PolicyClient{

	@Override
	public PolicyDTO getPolicyById(Long id) {
		
		PolicyDTO fallbackresponse = new PolicyDTO();
	      fallbackresponse.setPolicyHolderName("unavailable");
	      fallbackresponse.setPolicyType("N/A");
		
		return fallbackresponse;
	}
	
	

}
