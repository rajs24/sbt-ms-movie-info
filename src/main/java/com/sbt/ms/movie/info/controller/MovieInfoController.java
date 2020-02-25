package com.sbt.ms.movie.info.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.ms.movie.info.models.Movie;
import com.sbt.ms.movie.info.service.MovieInfoService;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@Autowired
	private MovieInfoService movieInfoService;

	/**
	 * Get all movie details from db
	 * 
	 * @return list
	 */
	@RequestMapping("/all")
	public List<Movie> getAllMovies() {
		return movieInfoService.getAllMovies();
	}

	/**
	 * Get a specific movie details
	 * 
	 * @param movieId
	 * @return
	 */
	@RequestMapping("/{movieId}")
	public Optional<Movie> getMovieInfo(@PathVariable("movieId") int movieId) {
		return movieInfoService.getMovie(movieId);
	}
}
