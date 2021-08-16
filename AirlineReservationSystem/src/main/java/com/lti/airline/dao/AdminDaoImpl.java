package com.lti.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lti.airline.entity.Admin;
import com.lti.airline.entity.Flights;

@Repository("AdminDao")
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public List<Flights> showAllFlights() {
		String sql = "SELECT f FROM Flights f";

		Query q = em.createQuery(sql);

		List<Flights> flightsList = q.getResultList();
		return flightsList;

	}
	
	@Override
	@Transactional
	public String addFlight(Flights flight) {
		
		em.persist(flight);
		
		return "Flight added" ;

}


//	@Override
//	@Transactional
//	public String deleteFlight(String flid) {
//		Flights flight=em.find(Flights.class,flid);
//		em.remove(flight);
//		return "Flight deleted";
//	}


		    
 
		
	}


