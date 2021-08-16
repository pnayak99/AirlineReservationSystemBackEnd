package com.lti.airline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Admins")
public class Admin {
	
	public Admin() {
		super();
	}
	public Admin(String adminId, String userName, String password) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
	}
	
	@Id
	@Column(name="admin_id")
	private String adminId;
	
	@Column(name="UserName")
	private String userName;
	
	@Column(name="Password")
	private String password;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}