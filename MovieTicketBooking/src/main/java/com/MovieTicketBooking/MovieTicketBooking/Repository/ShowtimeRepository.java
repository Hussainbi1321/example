package com.MovieTicketBooking.MovieTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieTicketBooking.MovieTicketBooking.Model.Showtime;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime,Long>{

}
