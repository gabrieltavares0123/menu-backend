package com.magrathea.menu.food.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<FoodEntity, UUID> {
}
