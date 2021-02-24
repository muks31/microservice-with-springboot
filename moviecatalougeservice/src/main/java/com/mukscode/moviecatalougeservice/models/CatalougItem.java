package com.mukscode.moviecatalougeservice.models;

public class CatalougItem {

	private String name;
	private String description;
	private int rating;
	
	
	/**
	 * @param name
	 * @param description
	 * @param rating
	 */
	public CatalougItem(String name, String description, int rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
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
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
