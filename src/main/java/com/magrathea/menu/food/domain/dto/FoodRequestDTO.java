package com.magrathea.menu.food.domain.dto;

import java.util.UUID;

public record FoodRequestDTO(UUID id, String title, String image, Float price) {
}
