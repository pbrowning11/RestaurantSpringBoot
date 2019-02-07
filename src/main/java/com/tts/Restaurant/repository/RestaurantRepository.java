package com.tts.Restaurant.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.Restaurant.models.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
