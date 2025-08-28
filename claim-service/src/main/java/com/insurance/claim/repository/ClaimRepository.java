package com.insurance.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.claim.entity.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long>{
	
    List<Claim> findByPolicyId(Long policyId);

	
	
	
	
	
	
	
	
	
	
	
	
	

}
