package com.magrathea.menu.food.controller;

import com.magrathea.menu.core.GenericResponse;
import com.magrathea.menu.food.domain.dto.FoodRequestDTO;
import com.magrathea.menu.food.domain.dto.FoodResponseDTO;
import com.magrathea.menu.food.domain.service.LoadAllFood;
import com.magrathea.menu.food.domain.service.SaveFood;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final SaveFood saveFood;
    private final LoadAllFood loadAllFood;

    public FoodController(SaveFood saveFood, LoadAllFood loadAllFood) {
        this.saveFood = saveFood;
        this.loadAllFood = loadAllFood;
    }

    @PostMapping
    public ResponseEntity<GenericResponse<FoodResponseDTO>> save(@RequestBody FoodRequestDTO foodRequest) {
        FoodResponseDTO foodResponse = saveFood.save(foodRequest);
        return ResponseEntity.ok(
                GenericResponse.<FoodResponseDTO>builder()
                        .success(Boolean.TRUE)
                        .message("Food creation success!")
                        .data(foodResponse)
                        .build()
        );
    }

    @GetMapping
    public ResponseEntity<GenericResponse<Set<FoodResponseDTO>>> loadAll() {
        Set<FoodResponseDTO> allFoodResponse = loadAllFood.loadAll();
        return ResponseEntity.ok(
                GenericResponse.<Set<FoodResponseDTO>>builder()
                        .success(Boolean.TRUE)
                        .message("Load all food success!")
                        .data(allFoodResponse)
                        .build()
        );
    }
}
