package io.javabrains.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingdataservice.model.Rating;
import io.javabrains.ratingdataservice.model.UserRatings;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId")String movieId)
	{
		return new Rating(movieId,4);
	}
	
	@RequestMapping("/user/{userId}")
	public UserRatings getUserRating(@PathVariable("userId")String userId)
	{
		List<Rating> ratings=Arrays.asList(
				new Rating("1234", 4),
				new Rating("5678", 4)
				);
		UserRatings ur=new UserRatings();
		ur.setRatings(ratings);
		return ur;
	}

}
