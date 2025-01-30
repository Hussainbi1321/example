package com.MovieTicketBooking.MovieTicketBooking.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Showtime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showtimeId;
    
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private LocalDateTime showTime;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    public Long getShowtimeId() {
		return showtimeId;
	}

	public Movie getMovie() {
		return movie;
	}

	public Theater getTheater() {
		return theater;
	}

	public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowtimeId(Long showtimeId) {
		this.showtimeId = showtimeId;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}

	
    
    // Getters and setters
}

//	showtime_id (Primary Key)
//	movie_id (Foreign Key, references Movie)
//	theater_id (Foreign Key, references Theater)
//	show_time (timestamp of when the movie is scheduled)
//	screen_number (which screen inside the theater)
//	price (ticket price for this showtime)
//}
