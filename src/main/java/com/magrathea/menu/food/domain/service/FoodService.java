package com.magrathea.menu.food.domain.service;

import com.magrathea.menu.food.data.FoodEntity;
import com.magrathea.menu.food.data.FoodRepository;
import com.magrathea.menu.food.domain.dto.FoodRequestDTO;
import com.magrathea.menu.food.domain.dto.FoodResponseDTO;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FoodService implements LoadAllFood, SaveFood {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Set<FoodResponseDTO> loadAll() {
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).collect(Collectors.toSet());
    }

    @Override
    public FoodResponseDTO save(FoodRequestDTO foodRequest) {
        FoodEntity foodEntity = foodRepository.save(new FoodEntity(foodRequest));
        return new FoodResponseDTO(foodEntity);
    }
}
