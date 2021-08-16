package com.lti.airline.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
//@SequenceGenerator(name="seq_flightId", initialValue=1, allocationSize=1)
@Table(name="Users")
public class Users {

	@Id
	@Column(name="User_Id")
	private String userId;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="Phone_Number")
	private String phoneNumber;
	
	@Column(name="Email_Id")
	private String emailId;
	
	@Column(name="Password")
	private String password;
	
	
	@OneToMany(mappedBy="user")
	@JsonManagedReference
	private List<Booking> booking;

	
	
	
	public Users() {
		super();
	}

	
	public Users(String userId, String firstName, String lastName, Date dob, String phoneNumber, String emailId,
			String password, List<Booking> booking) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.booking = booking;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", password=" + password + ", booking="
				+ booking + "]";
	}

	

	

	
	
	
	
}