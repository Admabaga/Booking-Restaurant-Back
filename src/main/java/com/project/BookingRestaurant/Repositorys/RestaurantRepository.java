package com.project.BookingRestaurant.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BookingRestaurant.Entitys.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
