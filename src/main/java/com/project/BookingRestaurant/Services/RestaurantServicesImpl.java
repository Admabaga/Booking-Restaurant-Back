package com.project.BookingRestaurant.Services;

import org.springframework.stereotype.Service;

import com.project.BookingRestaurant.Converters.RestaurantConverter;
import com.project.BookingRestaurant.Dtos.RestaurantDTO;
import com.project.BookingRestaurant.Entitys.Restaurant;
import com.project.BookingRestaurant.Repositorys.RestaurantRepository;

@Service
public class RestaurantServicesImpl implements RestaurantServices {

	private final RestaurantRepository restaurantRepository;
	
	public RestaurantServicesImpl(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}
	
	@Override
	public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
		Restaurant restaurant = RestaurantConverter.dtoToEntity(restaurantDTO);
		restaurantRepository.save(restaurant);
		return RestaurantConverter.entityToDto(restaurant);
	}

}
