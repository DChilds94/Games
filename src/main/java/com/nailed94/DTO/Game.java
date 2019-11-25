package com.nailed94.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game {
    // This class will expand to contain all the properties of the game,
    @Id
    private Integer id;
    private String name;

    public Game(String name) {
        this.name = name;
    }
}
