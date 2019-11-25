package com.nailed94.service;

import com.nailed94.DAO.PlayerDao;
import com.nailed94.DTO.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerDao playerDao;

    public List<Player> getAllPlayers(Integer gameId) {
        List<Player> players = new ArrayList<>();
        playerDao.findByGameId(gameId).forEach(players::add);
        return players;
    }

    public Player findById(Integer id) {
        return playerDao.findById(id).orElse(null);
    }

    public void addPlayer(Player player) {
        playerDao.save(player);
    }

    public void updatePlayer(Player player) {
        playerDao.save(player);
    }

    public void deleteById(Integer id) {
        playerDao.deleteById(id);
    }

}
