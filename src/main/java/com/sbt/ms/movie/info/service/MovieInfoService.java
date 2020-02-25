package com.sbt.ms.movie.info.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.ms.movie.info.models.Movie;

@Service
public class MovieInfoService {

	@Autowired
	private MovieInfoRepository repository;

	/**
	 * Get all movie details from db
	 * 
	 * @return list
	 */
	public List<Movie> getAllMovies() {

		List<Movie> movieList = new ArrayList<Movie>();
		repository.findAll().forEach(movieList::add);
		return movieList;
	}

	/**
	 * Get a specific movie details
	 * 
	 * @param movieId
	 * @return
	 */
	public Optional<Movie> getMovie(int movieId) {

		return repository.findById(movieId);
	}

}
