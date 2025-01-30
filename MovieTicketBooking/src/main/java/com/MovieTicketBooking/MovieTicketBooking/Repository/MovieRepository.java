package com.MovieTicketBooking.MovieTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieTicketBooking.MovieTicketBooking.Model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{

}
