package com.mukscode.moviecatalougeservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.mukscode.moviecatalougeservice.models.CatalougItem;
import com.mukscode.moviecatalougeservice.models.Movie;
import com.mukscode.moviecatalougeservice.models.Rating;
import com.mukscode.moviecatalougeservice.models.UserRating;

@RestController
@RequestMapping("/catalouge")
public class MovieCatalougeResource {

	@Autowired
	private RestTemplate restTemplate;
	
	/*@Autowired
	private WebClient.Builder webClientBuilder ;*/
	
	@RequestMapping("/{userId}")
	public List<CatalougItem> getCatalouge(@PathVariable("userId") String userId){
		
		//get all rated movie IDs
		UserRating ratings = restTemplate.getForObject("http://localhost:8070/ratingsdata/users/" + userId, UserRating.class);
		return ratings.getUserRating().stream().map(rating ->{
			//for each movie id, call movbie info service and get details
			Movie movie = restTemplate.getForObject("http://localhost:8060/movies/"+rating.getMovieId(), Movie.class);
			/*Movie movie = webClientBuilder.build()
			.get()
			.uri("http://localhost:8060/movies/"+rating.getMovieId())
			.retrieve()
			.bodyToMono(Movie.class)
			.block();*/
			//put them all together
			return new CatalougItem(movie.getName(), "Desc", rating.getRating());
		})
		.collect(Collectors.toList());
		
		
		
		
	
		
		
	}
}
