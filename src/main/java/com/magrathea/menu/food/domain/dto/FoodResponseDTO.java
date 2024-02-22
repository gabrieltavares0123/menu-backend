package com.magrathea.menu.food.domain.dto;

import com.magrathea.menu.food.data.FoodEntity;

import java.util.UUID;

public record FoodResponseDTO(UUID id, String title, String image, Float price) {
    public FoodResponseDTO(FoodEntity food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
