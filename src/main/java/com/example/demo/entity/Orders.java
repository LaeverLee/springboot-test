package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.*;


@Entity
@Table(name = "orders")
public class Orders implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_ID")
	private Integer orderId;
	@Column(name="order_NAME")
	private String orderName;
	@Column(name="company_ID")
	private Integer companyId;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Orders() {
		super();
	}
	public Orders(Integer orderId, String orderName, Integer companyId) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", companyId=" + companyId + "]";
	}
	
	

}
