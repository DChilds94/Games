package com.nailed94.controller;

import com.nailed94.DTO.Player;
import com.nailed94.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getAllGames() {
        return playerService.getAllPlayers();
    }

    @GetMapping("players/{id}")
    public Player getPlayer(@PathVariable Integer id) {
        return playerService.findById(id);
    }

    @PostMapping("players")
    public void addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
    }

    @PutMapping("players/{id}")
    public void updatePlayer(@RequestBody Player player, @PathVariable Integer id) {
        playerService.updatePlayer(player, id);
    }

    @DeleteMapping("players/{id}")
    public void deletePlayer(@PathVariable Integer id) {
        playerService.deleteById(id);
    }

}
