package com.nailed94.controller;

import com.nailed94.DTO.Game;
import com.nailed94.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("/games")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("games/{id}")
    public Game getGame(@PathVariable Integer id) {
        return gameService.findById(id);
    }

    @PostMapping("games")
    public void addGame(@RequestBody Game game) {
        gameService.addGame(game);
    }
}
