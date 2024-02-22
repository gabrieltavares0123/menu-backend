package com.magrathea.menu.food.domain.service;

import com.magrathea.menu.food.domain.dto.FoodResponseDTO;

import java.util.Set;

public interface LoadAllFood {
    Set<FoodResponseDTO> loadAll();
}
