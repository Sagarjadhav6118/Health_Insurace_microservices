package com.health_insurance.policy_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "insurance_policies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsurancePolicy {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String policyHolderName;
	    private String policyType;
	    private double premium;
	    private double coverageAmount;
	    private LocalDate startDate;
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
		private LocalDate endDate;
}
