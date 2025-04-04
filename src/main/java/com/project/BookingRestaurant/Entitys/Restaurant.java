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
	
	public Restaurant(Integer id, String name, String description, String image) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}
	
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
