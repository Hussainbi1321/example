package com.MovieTicketBooking.MovieTicketBooking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
    private String title;
    private String genre;
    private String description;
    private String rating;
    private Integer duration; // in minutes
    private String language;
//	movie_id (Primary Key)
//	title
//	genre (e.g., action, drama, comedy, etc.)
//	duration (in minutes)
//	description (short synopsis)
//	release_date
//	rating (e.g., PG-13, R)
//	language (e.g., English, Hindi, Spanish)
//	director
//	cast (list of actors/actresses)
//	poster_url (image link)
//	trailer_url (optional)
	public Long getMovieId() {
		return movieId;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public String getDescription() {
		return description;
	}
	public String getRating() {
		return rating;
	}
	public Integer getDuration() {
		return duration;
	}
	public String getLanguage() {
		return language;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
