package com.MovieTicketBooking.MovieTicketBooking.Model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    public Long getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	private String password;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
//	user_id (Primary Key)
//	first_name
//	last_name
//	email
//	password (hashed)
//	phone_number
//	address (optional)
//	user_type (customer/admin)
//	registration_date
//	payment_preferences (e.g., preferred payment methods)
//	booking_history (list of previous bookings, can be a reference or foreign key)
}
