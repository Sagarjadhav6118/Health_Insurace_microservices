package com.insurance.claim.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.insurance.claim.dto.PolicyDTO;
import com.insurance.claim.service.config.FeignClientConfig;
import com.insurance.claim.service.fallback.PolicyClientfallback;

@FeignClient(name="policy-service",  configuration = FeignClientConfig.class , fallback = PolicyClientfallback.class
)
public interface PolicyClient {
	
	@GetMapping("/api/policies/{id}")
	PolicyDTO getPolicyById(@PathVariable("id") Long id);
	

}
