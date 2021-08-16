package com.lti.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airline.entity.Admin;

public interface AdminLoginDao extends JpaRepository<Admin, String> {
	
	public Admin findByUserNameAndPassword(String userName,String password);

}