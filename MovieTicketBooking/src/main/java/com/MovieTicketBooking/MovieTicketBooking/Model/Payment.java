package com.MovieTicketBooking.MovieTicketBooking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private Double amount;
    private String paymentMethod;
    public Long getPaymentId() {
		return paymentId;
	}
	public User getUser() {
		return user;
	}
	public Booking getBooking() {
		return booking;
	}
	public Double getAmount() {
		return amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public String getStatus() {
		return status;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status; // success, failed

    // Getters and setters
}

//public class Payment {
//	payment_id (Primary Key)
//	user_id (Foreign Key, references User)
//	booking_id (Foreign Key, references Booking)
//	payment_method (credit card, PayPal, wallet, etc.)
//	payment_amount
//	payment_date
//	payment_status (success, failed, pending)
//
//}
