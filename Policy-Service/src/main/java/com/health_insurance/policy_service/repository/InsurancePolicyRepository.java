package com.health_insurance.policy_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health_insurance.policy_service.entity.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {

}
