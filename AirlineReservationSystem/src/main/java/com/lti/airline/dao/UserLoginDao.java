package com.lti.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.airline.entity.Users;

public interface UserLoginDao extends JpaRepository<Users, String> {
	
	public Users findByuserIdAndPassword(String userId,String password);

}