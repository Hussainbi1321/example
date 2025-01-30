package com.MovieTicketBooking.MovieTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieTicketBooking.MovieTicketBooking.Model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long >{

}
