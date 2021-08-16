package com.lti.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.entity.Admin;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Passengers;
import com.lti.airline.services.AdminServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class AdminController {

	@Autowired
	private AdminServiceImpl adminService;
	
	// http://localhost:8090/api/v1/admins
	@GetMapping("/showAllFlights")
	public List<Flights> showAllFlights(){
		List<Flights> flightsList=adminService.showAllFlights();
		return flightsList;
	}
	  

	
	// http://localhost:8090/api/v1/addnewflight
	@PostMapping("/addnewflight")
	public String addFlight(@RequestBody Flights flight) {

		String msg = adminService.addFlight(flight);

		return msg;
	}
	
	
//    // http://localhost:8090/api/v1/deleteFlight/ZM115
//	@GetMapping("/deleteFlight/{id}")
//	public String deleteFlight(@PathVariable(value = "id") String flid) {
//
//		String msg = adminService.deleteFlight(flid);
//		return msg;
//	}
	

}
