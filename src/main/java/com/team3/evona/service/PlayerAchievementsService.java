package com.team3.evona.service;

import com.team3.evona.repository.PlayerAchievementsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerAchievementsService {

    @Autowired
    PlayerAchievementsRepo playerAchievementsRepo;


}
