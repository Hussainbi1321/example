package com.MovieTicketBooking.MovieTicketBooking.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


	@ControllerAdvice
	public class GlobalExceptionHandler {

	    @ExceptionHandler(MovieNotFoundException.class)
	    public ResponseEntity<String> handleMovieNotFound(MovieNotFoundException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(UserNotFoundException.class)
	    public ResponseEntity<String> handleUserNotFound(UserNotFoundException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(ShowtimeNotFoundException.class)
	    public ResponseEntity<String> handleShowtimeNotFound(ShowtimeNotFoundException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleGenericException(Exception ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}


