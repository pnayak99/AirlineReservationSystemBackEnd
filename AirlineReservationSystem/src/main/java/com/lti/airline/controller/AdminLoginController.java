package com.lti.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.entity.Admin;
import com.lti.airline.services.AdminLoginServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/v1")
public class AdminLoginController {
	
    @Autowired
	private AdminLoginServiceImpl adminService;
    
 // http://localhost:8095/arl/v1/adminlogin
    @CrossOrigin(origins="*")
    @PostMapping("/adminlogin")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		String tempUserName = admin.getUserName();
		String tempPwd = admin.getPassword();
		Admin adminObj =null;
		if (tempUserName != null && tempPwd != null) 
		{
			adminObj = adminService.fetchAdminByUserNameAndPassword(tempUserName, tempPwd);
		}
		if(adminObj==null) {
			throw new Exception("Bad Cred");
		}
		return adminObj;
	}

}