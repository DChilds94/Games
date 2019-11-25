package com.nailed94.controller;

import com.nailed94.DTO.Game;
import com.nailed94.DTO.Player;
import com.nailed94.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/games/{id}/players")
    public List<Player> getAllGames(@PathVariable Integer id) {
        return playerService.getAllPlayers(id);
    }

    @GetMapping("/games/{gameId}/players/{id}")
    public Player getPlayer(@PathVariable Integer id) {
        return playerService.findById(id);
    }

    @PostMapping("/games/{gameId}/players")
    public void addPlayer(@RequestBody Player player, @PathVariable Integer gameId) {
        player.setGame(new Game(gameId,"Hardcoded"));
        playerService.addPlayer(player);
    }

    @PutMapping("/games/{gameId}/players/{id}")
    public void updatePlayer(@RequestBody Player player,
                             @PathVariable Integer id, @PathVariable Integer gameId) {
        player.setGame(new Game(gameId, ""));
        playerService.updatePlayer(player);
    }

    @DeleteMapping("/games/{gameId}/players/{id}")
    public void deletePlayer(@PathVariable Integer id) {
        playerService.deleteById(id);
    }

}
