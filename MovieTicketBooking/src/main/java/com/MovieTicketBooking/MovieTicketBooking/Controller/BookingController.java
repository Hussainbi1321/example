package com.MovieTicketBooking.MovieTicketBooking.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MovieTicketBooking.MovieTicketBooking.Model.Booking;
import com.MovieTicketBooking.MovieTicketBooking.Service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

//    @Autowired
//    private BookingService bookingService;
//
//    @PostMapping("/book")
//    public Booking bookTickets(@RequestParam Long userId, 
//                               @RequestParam Long showtimeId, 
//                               @RequestParam Set<Long> seatIds) {
//        return bookingService.bookMovieTickets(userId, showtimeId, seatIds);
    
//}
	@GetMapping
	public String getmap() {
		return "hello";
	}
	
}
