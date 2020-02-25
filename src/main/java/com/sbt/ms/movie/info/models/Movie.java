package com.sbt.ms.movie.info.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_INFO")
public class Movie {

	@Id
	@Column(name = "movie_id")
	private int movieId;
	
	@Column(name = "movie_name")
	private String name;
	
	@Column(name = "movie_desc")
	private String desc;

	public Movie() {

	}

	public Movie(int movieId, String name, String desc) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
