package com.project.BookingRestaurant.Dtos;

import lombok.Data;

@Data
public class RestaurantDTO {
	private Integer id;
	private String name;
	private String description;
	private String address;
	private String image;
	
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImage(){
		return this.image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
