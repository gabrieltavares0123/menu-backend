package com.magrathea.menu.food.data;

import com.magrathea.menu.food.domain.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "food")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String image;
    private Float price;

    public FoodEntity(FoodRequestDTO foodDto) {
        this.id = foodDto.id();
        this.title = foodDto.title();
        this.image = foodDto.image();
        this.price = foodDto.price();
    }
}
