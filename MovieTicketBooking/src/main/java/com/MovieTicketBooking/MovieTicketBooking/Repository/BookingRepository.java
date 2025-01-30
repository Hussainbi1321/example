package com.MovieTicketBooking.MovieTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieTicketBooking.MovieTicketBooking.Model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>{

}
