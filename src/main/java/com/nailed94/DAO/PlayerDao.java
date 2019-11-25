package com.nailed94.DAO;

import com.nailed94.DTO.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends CrudRepository<Player, Integer> {
}
