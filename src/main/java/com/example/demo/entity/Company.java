package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Company {
	
	public Company() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="company_ID")
	private Integer companyId;
	@Column(name="company_NAME")
	private String companyName;
	
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Company(Integer companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	
}
