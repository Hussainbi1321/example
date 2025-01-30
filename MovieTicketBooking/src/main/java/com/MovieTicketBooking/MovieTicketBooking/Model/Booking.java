package com.MovieTicketBooking.MovieTicketBooking.Model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
	public class Booking {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long bookingId;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;
	    
	    public User getUser() {
			return user;
		}



		public void setUser(User user) {
			this.user = user;
		}



		public void setShowtime(Showtime showtime) {
			this.showtime = showtime;
		}

		@ManyToOne
	    @JoinColumn(name = "showtime_id")
	    private Showtime showtime;
	    
	    @ManyToMany
	    @JoinTable(name = "booking_seat", 
	               joinColumns = @JoinColumn(name = "booking_id"), 
	               inverseJoinColumns = @JoinColumn(name = "seat_id"))
	    private Set<Seat> seats;

	    public Long getBookingId() {
			return bookingId;
		}

		

		public Showtime getShowtime() {
			return showtime;
		}

		public Set<Seat> getSeats() {
			return seats;
		}

		public Double getTotalAmount() {
			return totalAmount;
		}

		public void setBookingId(Long bookingId) {
			this.bookingId = bookingId;
		}

	

		

		public void setSeats(Set<Seat> seats) {
			this.seats = seats;
		}

		public void setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
		}

		private Double totalAmount;

	    // Getters and setters
	

//	booking_id (Primary Key)
//	user_id (Foreign Key, references User)
//	showtime_id (Foreign Key, references Showtime)
//	booking_date (timestamp when the booking was made)
//	status (e.g., confirmed, canceled, pending)
//	total_amount (total cost for the booking)
//	payment_status (paid, pending, failed)
//	payment_id (Foreign Key, references Payment entity)

}
