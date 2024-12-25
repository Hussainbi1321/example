package com.MovieTicketBooking.MovieTicketBooking.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieTicketBooking.MovieTicketBooking.Exceptions.ShowtimeNotFoundException;
import com.MovieTicketBooking.MovieTicketBooking.Exceptions.UserNotFoundException;
import com.MovieTicketBooking.MovieTicketBooking.Model.Booking;
import com.MovieTicketBooking.MovieTicketBooking.Model.Seat;
import com.MovieTicketBooking.MovieTicketBooking.Model.Showtime;
import com.MovieTicketBooking.MovieTicketBooking.Model.User;
import com.MovieTicketBooking.MovieTicketBooking.Repository.BookingRepository;
import com.MovieTicketBooking.MovieTicketBooking.Repository.SeatRepository;
import com.MovieTicketBooking.MovieTicketBooking.Repository.ShowtimeRepository;
import com.MovieTicketBooking.MovieTicketBooking.Repository.UserRepository;

@Service
public class BookingService {

//	  @Autowired(required=true)
//	  private BookingRepository bookingRepository;
//	    @Autowired
//	    private ShowtimeService showtimeservice;
//	    @Autowired
//	    private UserService userservice;
//	    @Autowired
//	    private ShowtimeRepository showtimeRepository;
//	    @Autowired
//	    private SeatRepository seatRepository;
//
//	    public Booking bookMovieTickets(Long userId, Long showtimeId, Set<Long> seatIds) {
//	       // User user = userRepository.findById(userId);//orElseThrow(()-> new UserNotFoundException("User not found"));
//	        User userd=userservice.getuserById(userId);
//	    	Showtime showtime = showtimeservice.getShowtimesById(showtimeId);//orElseThrow(() -> new ShowtimeNotFoundException("Showtime not found"));
//
//	        //Set<Seat> seats = seatRepository.findAllById(seatIds);
//	        Set<Seat> seats = (Set<Seat>) seatRepository.findAllById(seatIds);
//	        double totalAmount = calculateTotalAmount((List<Seat>) seats);
//
//	        Booking booking= new Booking();
//	        booking.setUser(userd);
//	        booking.setShowtime(showtime);
//	        booking.setSeats(seats);
//  booking.setTotalAmount(totalAmount);
//	        return bookingRepository.save(booking);
//	    }
//
//	    private double calculateTotalAmount(List<Seat> seats) {
//	        return seats.stream().mapToDouble(seat -> seat.getPrice()).sum();
//	    }
	}
	


