package com.lti.airline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.dao.AdminDao;
import com.lti.airline.entity.Admin;
import com.lti.airline.entity.Flights;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao; 
	
	
	public AdminDao getAdminDao() {
		return adminDao;
	}


	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


	@Override
	public List<Flights> showAllFlights() {
		
		return adminDao.showAllFlights();
	}

	@Override
	public String addFlight(Flights flight) {
		
		return adminDao.addFlight(flight);
	}


//	@Override
//	public String deleteFlight(String flid) {
//		
//		return adminDao.deleteFlight(flid);
//	}



}
