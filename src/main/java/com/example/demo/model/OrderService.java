package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;

@Service
public class OrderService {
	
	@Autowired
	OrderDAO orderDAO;
	
	public List<Orders> getAll(){
		return orderDAO.findAll();
	}
	
	public List<Orders> selectByCompany(Integer id){
		List<Orders> orderList = orderDAO.selectByCompany(id);
		return orderList;
	}
	
	public Orders selectByOrderId(Integer id){
		Orders order = orderDAO.findById(id).orElse(null);
		return order;
	}
	
}