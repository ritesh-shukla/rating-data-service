package io.javabrains.ratingdataservice.model;

import java.util.List;

public class UserRatings {
	
	//private String userId;
    private List<Rating> ratings;
	/*
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}*/
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
    
    

}
