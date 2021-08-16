package com.lti.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lti.airline.entity.Booking;
import com.lti.airline.entity.Flights;
import com.lti.airline.entity.Passengers;
import com.lti.airline.entity.Users;


@Repository("UsersDao")
@EnableTransactionManagement
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;	
	
	@Override
	@Transactional
	public String saveUser(Users user) {
		// TODO Auto-generated method stub	
     	System.out.println("Dao Layer -->" + user);
		em.persist(user);
		return "User Added Successfully";
	}

    //
	@Override
    @Transactional
	public List<Flights> searchFlightByCity(String firstCity, String finalCity){
	
	    Query q = em.createQuery(" SELECT f from Flights f WHERE f.toCity =: f1 AND f.fromCity = :f2");
	    q.setParameter("f1", firstCity).setParameter("f2",finalCity);
	    
	    List<Flights> searchOutput = q.getResultList();   
		return searchOutput;
	}
	


	@Override
	@Transactional
	public String userBooking(Booking booking) {
		em.persist(booking);
		return "Ticket booking done succesfully";
		
	}
   
	@Override
	@Transactional
	public Passengers passengerList(Passengers passenger) {
		em.persist(passenger);
		return passenger;
	}

//	@Override
//	@Transactional
//	public String cancelBooking(int bookingId) {
//		Booking b = em.find(Booking.class, bookingId);
//		Query passengerQuery = em.createQuery("DELETE FROM Passengers p WHERE p.bookingId= :pasbid");
//		passengerQuery.setParameter("pasbid", bookingId).executeUpdate();	
//		Query paymentQuery = em.createQuery("DELETE FROM Payment p WHERE p.paymentBookingId= :paybid");
//		paymentQuery.setParameter("paybid", bookingId).executeUpdate();	
//		em.remove(b);
//		return "User cancelled booking successfully";
//	}
//	
	
	

}
