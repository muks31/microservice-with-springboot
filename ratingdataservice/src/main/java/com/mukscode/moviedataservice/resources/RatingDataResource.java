package com.mukscode.moviedataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mukscode.moviedataservice.models.Rating;
import com.mukscode.moviedataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String movieId) {
    	List<Rating> ratings = Arrays.asList(
                new Rating("1234", 3),
                new Rating("5678", 4) 
                );
    	 UserRating userRating = new UserRating();
    	 userRating.setUserRating(ratings);
        return userRating;
        
        
        
    }
}