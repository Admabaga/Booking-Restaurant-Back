package com.project.BookingRestaurant.Converters;

import com.project.BookingRestaurant.Dtos.RestaurantDTO;
import com.project.BookingRestaurant.Entitys.Restaurant;

public class RestaurantConverter {
	
	public static Restaurant dtoToEntity(RestaurantDTO restaurantDTO) {
		Restaurant restaurant = new Restaurant();
		restaurant.setName(restaurantDTO.getName());
		restaurant.setAddress(restaurantDTO.getAddress());
		restaurant.setDescription(restaurantDTO.getDescription());
		restaurant.setImage(restaurantDTO.getImage());
		return restaurant;
	}
	
	public static RestaurantDTO entityToDto(Restaurant restaurant) {
		RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setId(restaurant.getId());
		restaurantDTO.setName(restaurant.getName());
		restaurantDTO.setAddress(restaurant.getAddress());
		restaurantDTO.setDescription(restaurant.getDescription());
		restaurantDTO.setImage(restaurant.getImage());
		return restaurantDTO;
	}

}
