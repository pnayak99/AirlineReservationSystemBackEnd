package com.lti.airline.services;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.dao.UserDao;
import com.lti.airline.entity.Booking;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Passengers;
import com.lti.airline.entity.Users;



@Service("userService")
public class UserServiceImpl implements UserService {
     
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

    public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

    @Override
	public String saveUser(Users user) {
	 	// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}

	@Override
	public List<Flights> searchFlightByCity(String firstCity, String finalCity) {
		// TODO Auto-generated method stub
		return userDao.searchFlightByCity(firstCity, finalCity);
	}




	@Override
	public String userBooking(Booking b) {
		return userDao.userBooking(b);
		
		
	}

	@Override
	public Passengers passengerList(Passengers passenger) {
		// TODO Auto-generated method stub
		return userDao.passengerList(passenger);
	}

//	@Override
//	public String cancelBooking(int bookingId) {
//		// TODO Auto-generated method stub
//	return userDao.cancelBooking(bookingId);
//	}

	
	
	
	
	
}
