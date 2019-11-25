package com.nailed94.DAO;

import com.nailed94.DTO.Game;
import com.nailed94.DTO.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDao extends CrudRepository<Player, Integer> {
    public List<Player> findByGameId(Integer gameId);


}
