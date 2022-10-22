package com.team3.evona.service;

import com.team3.evona.models.PlayerData;
import com.team3.evona.repository.PlayerDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerDataService {

    @Autowired
    PlayerDataRepo playerDataRepo;

    public List<PlayerData> getPlayerData(){
        return playerDataRepo.findAll();
    }

    public Optional<PlayerData> loginPlayer(PlayerData playerData){
       return playerDataRepo.findById(playerData.getId());
    }

    public PlayerData savePlayer(PlayerData playerData){
        return playerDataRepo.save(playerData) ;
    }
}