package com.example.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

import jakarta.transaction.Transactional;

@Repository
public interface OrderDAO extends JpaRepository<Orders, Integer>{

	@Transactional
	@Query(value = "SELECT * FROM demo.orders where company_ID = ?1", nativeQuery = true)
	List<Orders> selectByCompany(Integer ID);
}
