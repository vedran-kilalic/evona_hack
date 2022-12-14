package com.team3.evona.repository;

import com.team3.evona.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDataRepo extends JpaRepository<Player, String> {

}
