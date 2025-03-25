package com.project.BookingRestaurant.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.BookingRestaurant.Dtos.RestaurantDTO;
import com.project.BookingRestaurant.Services.RestaurantServices;

@RestController
public class RestaurantController {
	
	private final RestaurantServices restaurantServices;
	
	public RestaurantController(RestaurantServices restaurantServices){
		this.restaurantServices = restaurantServices;
	}
	
	@PostMapping("/restaurant")
	public RestaurantDTO createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
		return restaurantServices.createRestaurant(restaurantDTO);
	}

}
