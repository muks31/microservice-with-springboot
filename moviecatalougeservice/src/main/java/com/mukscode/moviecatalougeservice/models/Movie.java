package com.mukscode.moviecatalougeservice.models;

public class Movie {
	
	private String movieId;
	private String name;
	
	public Movie() {}
	
	
	/**
	 * @param movieId
	 * @param name
	 */
	public Movie(String movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}
	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
