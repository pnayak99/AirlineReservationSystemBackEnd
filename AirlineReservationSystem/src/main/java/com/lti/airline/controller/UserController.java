package com.lti.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.entity.Booking;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Passengers;
import com.lti.airline.entity.Users;
import com.lti.airline.services.UserServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	public UserServiceImpl userService;
	
	   @PostMapping("/addnewuser")
	   public String saveUser(@RequestBody Users user) {
		   System.out.println("postuser");
		   return userService.saveUser(user);
	   }
	  
	   //http://localhost:8095/api/v1/searchflights/GOA/DELHI
	   
	   @GetMapping(value="/searchflights/{toCity}/{fromCity}",produces = "application/json")
		   
	    public List<Flights> searchFlightByCity(@PathVariable(value="toCity") String firstCity, @PathVariable(value="fromCity") String finalCity){
		   
		   List<Flights> f = userService.searchFlightByCity(firstCity, finalCity);
		  
		   return f;  
		   
	   }
	   
	 
	   
	   //http://localhost:8095/api/v1/userbooking
	   @PostMapping("/userbooking")
	   public String userBooking(@RequestBody Booking booking) {
		   return userService.userBooking(booking);
	   }
	   
	 //http://localhost:8095/api/v1/addnewpassenger
	   @PostMapping("/addnewpassenger")
	   public Passengers passengerList(@RequestBody Passengers passenger) {
		   System.out.println("post passenger");
		   return userService.passengerList(passenger);
		   
	   }
	   
	   
	   
	   
//	 //http://localhost:8090/api/v1/cancelbooking/B6572
//	   @DeleteMapping(value="/cancelbooking/{bookingId}")
//	   public String cancelBooking(@PathVariable int bookingId) {
//		   return userService.cancelBooking(bookingId);
//	   }
//	   

	   
	   
}
