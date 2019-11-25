package com.nailed94.DAO;

import com.nailed94.DTO.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDao extends CrudRepository<Game, Integer> {



}
