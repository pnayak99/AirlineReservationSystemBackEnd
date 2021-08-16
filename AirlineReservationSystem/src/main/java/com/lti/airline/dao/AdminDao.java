package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.entity.Admin;
import com.lti.airline.entity.Flights;

public interface AdminDao {

	public List<Flights> showAllFlights();
	
	public String addFlight(Flights flight);
	
	//public String deleteFlight(String flid);

	
}
