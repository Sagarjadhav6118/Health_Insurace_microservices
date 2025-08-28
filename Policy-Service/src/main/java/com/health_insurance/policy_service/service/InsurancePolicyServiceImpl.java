package com.health_insurance.policy_service.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_insurance.policy_service.entity.InsurancePolicy;
import com.health_insurance.policy_service.repository.InsurancePolicyRepository;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {
	
	
	 @Autowired
	    private InsurancePolicyRepository repository;

	    public InsurancePolicy createPolicy(InsurancePolicy policy) {
	        return repository.save(policy);
	    }

	    public List<InsurancePolicy> getAllPolicies() {	
	        return repository.findAll();
	    }

	    public InsurancePolicy getPolicyById(Long id) {
	        return repository.findById(id).orElseThrow();
	    }

	    public InsurancePolicy updatePolicy(Long id, InsurancePolicy updatedPolicy) {
	        InsurancePolicy existing = getPolicyById(id);
	        BeanUtils.copyProperties(updatedPolicy, existing, "id");
	        return repository.save(existing);
	    }

	    public void deletePolicy(Long id) {
	        repository.deleteById(id);
	    }
}
