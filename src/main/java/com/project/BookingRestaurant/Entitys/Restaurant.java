package com.project.BookingRestaurant.Entitys;

import jakarta.persistence.*;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String description;
	private String address;
	private String image;
		
	public Restaurant() {
		
	}
	
	public Restaurant(Long id, String name, String description, String image) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}
	

}
