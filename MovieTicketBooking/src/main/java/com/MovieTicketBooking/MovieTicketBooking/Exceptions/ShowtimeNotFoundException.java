package com.MovieTicketBooking.MovieTicketBooking.Exceptions;

public class ShowtimeNotFoundException extends RuntimeException{
	public ShowtimeNotFoundException(String msg) {
		super(msg);
	}

}
