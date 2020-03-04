package com.capgemini.movie.model;

import java.io.Serializable;

public class Movie implements Serializable {
	 
	int movieId;
	String movieName;
	String movieDirector;
	int movieLength;
	String movieReleaseDate;
	
	public Movie() 
	{
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.movieReleaseDate = movieReleaseDate;
	}


	public Movie(int movieId, String movieName, String movieDirector, int movieLength, String movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.movieReleaseDate = movieReleaseDate;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}


	
	  @Override public String toString() { return "Movie [movieId=" + movieId +
	  ", movieName=" + movieName + ", movieDirector=" + movieDirector +
	  ", movieLength=" + movieLength + ", movieReleaseDate=" + movieReleaseDate +
	  "]"; }
	 
	
}
