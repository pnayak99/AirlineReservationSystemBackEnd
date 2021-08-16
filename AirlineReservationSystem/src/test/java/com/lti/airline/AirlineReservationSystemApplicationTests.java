package com.lti.airline;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.airline.controller.AdminController;
import com.lti.airline.controller.UserController;
import com.lti.airline.dao.UserDaoImpl;
import com.lti.airline.entity.Admin;
import com.lti.airline.entity.Booking;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Users;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class AirlineReservationSystemApplicationTests {

	@Autowired
	UserController userController;
	@Autowired
	AdminController adminController;
	
/*Users user= new Users();
	
	@Test
	public void saveUser() {
		
		Date d=new Date(1986-05-24);
		user.setUserId("USER996");
		user.setFirstName("PRITAM");
		user.setLastName("CHOPRA");
		user.setDob(d);
		user.setPhoneNumber("7745123021");
		user.setEmailId("pritamgmail.com");
		user.setPassword("pritam24");
		Assertions.assertEquals("User Added Successfully", userController.saveUser(user));
	
	}*/
	
	/*Flights flights= new Flights();
	@Test
	public void addFlight() {
		Date departureDate=new Date(2021-05-24);
		Date returnDate=new Date(2021-07-14);
		flights.setFlightId("TM122");
		flights.setDepartureDate(departureDate);
		flights.setReturnDate(returnDate);
		flights.setToCity("HYDERABAD");
		flights.setFromCity("GOA");
		flights.setNoOfSeats(3);
		flights.setEconomyClassFare(4000);
		flights.setBusinessClassFare(8000);
		Assertions.assertEquals("Flight added",adminController.addFlight(flights));

	}*/
	
	/*@Test
	public void searchFlightByCity()
	{
		Flights sf=new Flights();
		
		userController.searchFlightByCity("DELHI","BANGALORE");
		
	}*/
	
	


}