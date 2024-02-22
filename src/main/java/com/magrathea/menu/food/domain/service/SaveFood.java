package com.magrathea.menu.food.domain.service;

import com.magrathea.menu.food.domain.dto.FoodRequestDTO;
import com.magrathea.menu.food.domain.dto.FoodResponseDTO;

public interface SaveFood {
    FoodResponseDTO save(FoodRequestDTO foodRequest);
}
