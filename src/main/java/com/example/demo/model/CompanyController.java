package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.entity.Orders;

@RestController
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/company/order")
	public List<Company> getCompany(){
		List<Company> companyList = companyService.getAll();
		return companyList;		
	}
	
	@GetMapping("/company/{id}")
	public List<Orders> selectOrder(@PathVariable Integer id){
		System.out.println(id);
		List<Orders> orderList = orderService.selectByCompany(id);
		return orderList;	
	}
	
	@GetMapping("/company/company1/{orderId}")
	public Orders selectOrderCompany(@PathVariable Integer orderId){
		Orders orders = orderService.selectByOrderId(orderId);
		System.out.println(orders);
		return orders;	
	}
	
}
