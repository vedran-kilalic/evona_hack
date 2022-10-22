package com.team3.evona.service;

import com.team3.evona.models.PlayerData;
import com.team3.evona.repository.PlayerDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerDataService {

    @Autowired
    PlayerDataRepo playerDataRepo;

    public List<PlayerData> getPlayerData(){
        return playerDataRepo.findAll();
    }

    public PlayerData loginPlayer(PlayerData playerData){
        List<PlayerData> players = playerDataRepo.findAll();
        for(int i = 0; i < players.size(); i++) {
            if (playerData.getId().equals(players.get(i).getId())) {
                return players.get(i);
            }
        }
       return null;
    }
}
