package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;

@Service
public class CompanyService {

	@Autowired
	CompanyDAO companyDAO;
	
	public List<Company> getAll(){
		return companyDAO.findAll();
	}
}
