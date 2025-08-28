package com.insurance.claim.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "claims")
public class Claim {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String claimNumber;
	    private String description;
	    private double claimAmount;
	    private LocalDate claimDate;

	    private Long policyId; // Foreign key reference to policy-service

	  
	    
		public Claim() {
			
		}

		public Claim(Long id, String claimNumber, String description, double claimAmount, LocalDate claimDate,
				Long policyId) {
			super();
			this.id = id;
			this.claimNumber = claimNumber;
			this.description = description;
			this.claimAmount = claimAmount;
			this.claimDate = claimDate;
			this.policyId = policyId;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getClaimNumber() {
			return claimNumber;
		}

		public void setClaimNumber(String claimNumber) {
			this.claimNumber = claimNumber;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getClaimAmount() {
			return claimAmount;
		}

		public void setClaimAmount(double claimAmount) {
			this.claimAmount = claimAmount;
		}

		public LocalDate getClaimDate() {
			return claimDate;
		}

		public void setClaimDate(LocalDate claimDate) {
			this.claimDate = claimDate;
		}

		public Long getPolicyId() {
			return policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
		}
	
}
