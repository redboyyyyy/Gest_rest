package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RestaurantService {
    Restaurant saveRestaurant(Restaurant restaurant);

    Restaurant updateRestaurant(Restaurant restaurant);

    void deleteRestaurantById(Long id);

    void deleteAllRestaurants();

    Optional<Restaurant> getRestaurantById(Long id);

    List<Restaurant> getAllRestaurants();
}
