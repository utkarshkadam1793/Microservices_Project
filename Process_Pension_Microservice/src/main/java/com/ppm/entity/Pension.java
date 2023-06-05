package com.ppm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pension {

	@Id
	private Long aadhar;
	private Integer amt;
	private Integer charge;
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}
	public Integer getCharge() {
		return charge;
	}
	public void setCharge(Integer charge) {
		this.charge = charge;
	}
	public Pension(Long aadhar, Integer amt, Integer charge) {
		super();
		this.aadhar = aadhar;
		this.amt = amt;
		this.charge = charge;
	}
	public Pension() {
		super();
	}
	
}
