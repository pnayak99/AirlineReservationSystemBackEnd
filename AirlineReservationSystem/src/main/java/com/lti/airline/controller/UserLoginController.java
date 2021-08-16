package com.lti.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.entity.Users;
import com.lti.airline.services.UserLoginServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/v1")
public class UserLoginController {
	
	  @Autowired
		private UserLoginServiceImpl userService1;
	  
	  @CrossOrigin(origins="*")
	    @PostMapping("/userlogin")
		public Users loginUser(@RequestBody Users user) throws Exception {
			String tempUserId = user.getUserId();
			String tempPwd = user.getPassword();
			Users userObj =null;
			if (tempUserId != null && tempPwd != null) 
			{
				userObj = userService1.fetchUserByemailIdAndPassword(tempUserId, tempPwd);
			}
			if(userObj==null) {
				throw new Exception("Bad Cred");
			}
			return userObj;
		}

	    
	

}