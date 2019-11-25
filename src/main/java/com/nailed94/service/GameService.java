package com.nailed94.service;

import com.nailed94.DAO.GameDao;
import com.nailed94.DTO.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameDao gameDao;

    public List<Game> getAllGames() {
        List<Game> games = new ArrayList<>();
        gameDao.findAll().forEach(games::add);
        return games;
    }

    public Game findById(Integer id) {
        return gameDao.findById(id).orElse(null);
    }

    public void addGame(Game game) {
        gameDao.save(game);
    }

    public void updateGame(Game game, Integer id) {
        gameDao.save(game);
    }

    public void deleteById(Integer id) {
        gameDao.deleteById(id);
    }


}
