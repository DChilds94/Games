package com.nailed94.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    // This class will expand to contain all the properties of the game,
    private Integer id;
    private String name;

    public Game(String name) {
        this.name = name;
    }
}
