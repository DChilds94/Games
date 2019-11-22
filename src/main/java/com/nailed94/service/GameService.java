package com.nailed94.service;

import com.nailed94.DTO.Game;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GameService {

        private List<Game> games = new ArrayList<>(Arrays.asList(
                new Game(1, "Crash"),
                new Game(2,"Pokemon"),
                new Game(3,"Fifa")));

        public List<Game> getAllGames() {
            return games;
        }

        public Game findById(Integer id) {
           return games.stream().filter(game -> game.getId().equals(id)).findFirst().get();
        }

        public void addGame(Game game) {
            games.add(game);
        }

        public void updateGame(Game game, Integer id) {
            for (int i = 0; i < games.size() ; i++) {
                Game g = games.get(i);
                if (g.getId().equals(id)) {
                    games.set(i, game);
                    return;
                }
            }
        }

        public void deleteById(Integer id) {
            games.removeIf(game -> game.getId().equals(id));
        }



}
