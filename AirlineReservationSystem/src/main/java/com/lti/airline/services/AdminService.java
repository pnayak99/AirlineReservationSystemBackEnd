package com.lti.airline.services;

import java.util.List;

import com.lti.airline.entity.Admin;
import com.lti.airline.entity.Flights;

public interface AdminService {

	public List<Flights> showAllFlights();
	
	public String addFlight(Flights flight);
	
	//public String deleteFlight(String flid);
	

	
}
