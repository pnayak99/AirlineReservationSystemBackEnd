package com.lti.airline.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name="seq_bookingId", initialValue=1000, allocationSize=1)
@Table(name="Bookings")
public class Booking {	
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="Booking_Id")
	private int bookingId;
	
	@Column(name="Booking_Date")
	private Date bookingDate ;
	
	@Column(name="Flight_Id")
	private String flightId;
	

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="USER_ID")
	private Users user;



	public Booking(int bookingId, Date bookingDate, String flightId, Users user) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.flightId = flightId;
		this.user = user;
	}



	public Booking() {
		super();
	}



	public int getBookingId() {
		return bookingId;
	}



	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}



	public Date getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}



	public String getFlightId() {
		return flightId;
	}



	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", flightId=" + flightId + ", user="
				+ user + "]";
	}
	
	

	
	



	

	
}