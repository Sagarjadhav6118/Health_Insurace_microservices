package com.health_insurance.policy_service.service;

import java.util.List;

import com.health_insurance.policy_service.entity.InsurancePolicy;

public interface InsurancePolicyService {
	
	InsurancePolicy createPolicy(InsurancePolicy policy);
    List<InsurancePolicy> getAllPolicies();
    InsurancePolicy getPolicyById(Long id);
    InsurancePolicy updatePolicy(Long id, InsurancePolicy updatedPolicy);
    void deletePolicy(Long id);

}
