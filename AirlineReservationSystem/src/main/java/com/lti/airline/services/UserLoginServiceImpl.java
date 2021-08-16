package com.lti.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.dao.UserLoginDao;
import com.lti.airline.entity.Users;

@Service
public class UserLoginServiceImpl {
	
	@Autowired
	private UserLoginDao userDao;
	
	public Users fetchUserByemailIdAndPassword(String userId, String password)
	{
		return userDao.findByuserIdAndPassword(userId, password);
	}

}