package com.MovieTicketBooking.MovieTicketBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MovieTicketBooking.MovieTicketBooking.Model.Movie;
import com.MovieTicketBooking.MovieTicketBooking.Service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

//    @Autowired
//    private MovieService movieService;
//
//    @GetMapping
//    public List<Movie> getAllMovies() {
//        return movieService.getAllmovies();
//    }
//
//    @GetMapping("/{movieId}")
//    public Movie getMovieById(@PathVariable Long movieId) {
//        return movieService.getMovieById(movieId);
//    }
//
//    @PostMapping
//    public Movie createMovie(@RequestBody Movie movie) {
//        return movieService.createMovie(movie);
//    }
//
//    @DeleteMapping("/{movieId}")
//    public void deleteMovie(@PathVariable Long movieId) {
//        movieService.deleteById(movieId);
//    }
}
