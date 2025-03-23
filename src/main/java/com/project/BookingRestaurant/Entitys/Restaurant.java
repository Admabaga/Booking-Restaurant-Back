package com.project.BookingRestaurant.Entitys;

import jakarta.persistence.*;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue
	private Long id;
	private String restaurantName;
	private String description;
	private String image;
	
	public Restaurant() {
		
	}
	
	public Restaurant(Long id, String restaurantName, String description, String image) {
		this.id = id;
		this.restaurantName = restaurantName;
		this.description = description;
		this.image = image;
	}
	

}
