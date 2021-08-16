package com.lti.airline.services;

import java.util.List;

import com.lti.airline.entity.Booking;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Passengers;
import com.lti.airline.entity.Users;


public interface UserService {

	public String saveUser(Users user);

	public List<Flights> searchFlightByCity(String firstCity, String finalCity);

	
	public String userBooking(Booking b);	
  
	public Passengers passengerList(Passengers passenger);
	
//	public String cancelBooking(int bookingId);


}
