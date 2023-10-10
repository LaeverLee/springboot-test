package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Integer>{

}
