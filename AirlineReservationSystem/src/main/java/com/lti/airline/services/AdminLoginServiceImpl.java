package com.lti.airline.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.dao.AdminLoginDao;
import com.lti.airline.entity.Admin;



@Service
public class AdminLoginServiceImpl  {
	
	@Autowired
	private AdminLoginDao adminDao;
	
	public Admin fetchAdminByUserNameAndPassword(String userName, String password)
	{
		return adminDao.findByUserNameAndPassword(userName, password);
	}

}