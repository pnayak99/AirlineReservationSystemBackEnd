package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.entity.Booking;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Passengers;
import com.lti.airline.entity.Users;


public interface UserDao {
	
	public String saveUser(Users user);
	public List<Flights> searchFlightByCity(String firstCity, String finalCity);

	
	public String userBooking(Booking booking);
	
//	public String cancelBooking(int bookingId);
	public Passengers passengerList(Passengers passenger);

}
