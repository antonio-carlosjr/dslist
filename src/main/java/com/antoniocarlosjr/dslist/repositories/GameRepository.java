package com.antoniocarlosjr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniocarlosjr.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
