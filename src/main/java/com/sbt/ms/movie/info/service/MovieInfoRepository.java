package com.sbt.ms.movie.info.service;

import org.springframework.data.repository.CrudRepository;

import com.sbt.ms.movie.info.models.Movie;

public interface MovieInfoRepository extends CrudRepository<Movie, Integer> {

}
