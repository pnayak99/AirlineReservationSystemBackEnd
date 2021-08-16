package com.lti.airline.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
//@SequenceGenerator(name="seq_flightId", initialValue=1, allocationSize=1)
@Table(name="Flights")
public class Flights {

	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Flight_Id")
	private String flightId;
	
	@Column(name="dpr_date")
	private Date departureDate;
	
	@Column(name="return_date")
	private Date returnDate;
	
	@Column(name="to_city")
	private String toCity;
	
	@Column(name="from_city")
	private String fromCity;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
	
	@Column(name="eco_class_fare")
	private long economyClassFare;
	
	@Column(name="business_class_fare")
	private long businessClassFare;
	
	@OneToMany(mappedBy="flight")
	@JsonManagedReference
	private List<Passengers> passengers;
	
	public List<Passengers> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public long getEconomyClassFare() {
		return economyClassFare;
	}
	public void setEconomyClassFare(long economyClassFare) {
		this.economyClassFare = economyClassFare;
	}
	public long getBusinessClassFare() {
		return businessClassFare;
	}
	public void setBusinessClassFare(long businessClassFare) {
		this.businessClassFare = businessClassFare;
	}
	
	
	
	
	
}
