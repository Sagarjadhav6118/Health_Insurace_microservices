package com.insurance.claim.dto;

import java.time.LocalDate;

import lombok.Data;

@Data	
public class PolicyDTO {
	
	  private Long id;
	    private String policyHolderName;
	    private String policyType;
	    private double premium;
	    private double coverageAmount;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    
	    
	    
	    
	    
		public PolicyDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PolicyDTO(Long id, String policyHolderName, String policyType, double premium, double coverageAmount,
				LocalDate startDate, LocalDate endDate) {
			super();
			this.id = id;
			this.policyHolderName = policyHolderName;
			this.policyType = policyType;
			this.premium = premium;
			this.coverageAmount = coverageAmount;
			this.startDate = startDate;
			this.endDate = endDate;
			
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPolicyHolderName() {
			return policyHolderName;
		}
		public void setPolicyHolderName(String policyHolderName) {
			this.policyHolderName = policyHolderName;
		}
		public String getPolicyType() {
			return policyType;
		}
		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
		public double getPremium() {
			return premium;
		}
		public void setPremium(double premium) {
			this.premium = premium;
		}
		public double getCoverageAmount() {
			return coverageAmount;
		}
		public void setCoverageAmount(double coverageAmount) {
			this.coverageAmount = coverageAmount;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public LocalDate getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}
	

}
