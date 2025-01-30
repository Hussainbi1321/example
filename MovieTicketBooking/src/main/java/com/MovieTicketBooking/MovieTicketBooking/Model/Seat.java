package com.MovieTicketBooking.MovieTicketBooking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
	public class Seat {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long seatId;
	    
	    @ManyToOne
	    @JoinColumn(name = "theater_id")
	    private Theater theater;
	    private double price;
	    private String seatNumber;
	    private boolean isBooked;
		public Long getSeatId() {
			return seatId;
		}
		public Theater getTheater() {
			return theater;
		}
		public String getSeatNumber() {
			return seatNumber;
		}
		public boolean isBooked() {
			return isBooked;
		}
		public void setSeatId(Long seatId) {
			this.seatId = seatId;
		}
		public void setTheater(Theater theater) {
			this.theater = theater;
		}
		public void setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
		}
		public void setBooked(boolean isBooked) {
			this.isBooked = isBooked;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}

	    // Getters and setters
	}

	
//	seat_id (Primary Key)
//	theater_id (Foreign Key, references Theater)
//	showtime_id (Foreign Key, references Showtime)
//	seat_number (unique seat identifier, e.g., A1, B2)
//	seat_type (standard, VIP, etc.)
//	status (available, booked, reserved)
//	price (price for the specific seat type)


