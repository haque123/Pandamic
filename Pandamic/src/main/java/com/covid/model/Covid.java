package com.covid.model;
 
 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

 
public class Covid {
 
	public Covid() {
	 
	}
	public Covid(Long totalTestResults, Long positive, Long negative, Long death) {
		super();
		this.totalTestResults = totalTestResults;
		this.positive = positive;
		this.negative = negative;
		this.death = death;
	}
	private Long totalTestResults;
    @Override
	public String toString() {
		return "Covid [totalTestResults=" + totalTestResults + ", positive=" + positive + ", negative=" + negative
				+ ", death=" + death + "]";
	}
	private Long positive;
    private Long negative;
    private Long death;
	public Long getTotalTestResults() {
		return totalTestResults;
	}
	public void setTotalTestResults(Long totalTestResults) {
		this.totalTestResults = totalTestResults;
	}
	public Long getPositive() {
		return positive;
	}
	public void setPositive(Long positive) {
		this.positive = positive;
	}
	public Long getNegative() {
		return negative;
	}
	public void setNegative(Long negative) {
		this.negative = negative;
	}
	public Long getDeath() {
		return death;
	}
	public void setDeath(Long death) {
		this.death = death;
	}
 

  
}
