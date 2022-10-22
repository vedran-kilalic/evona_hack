package com.team3.evona.repository;

import com.team3.evona.models.Achievements;
import com.team3.evona.models.PlayerAchievements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerAchievementsRepo extends JpaRepository<PlayerAchievements, Integer> {

}
