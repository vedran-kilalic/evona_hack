package com.team3.evona.controller;

import com.team3.evona.models.PlayerData;
import com.team3.evona.models.Transactions;
import com.team3.evona.service.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class PlayerDataController {

    @Autowired
    PlayerDataService playerDataService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Optional<PlayerData> login(@RequestBody PlayerData playerData){
        if (playerDataService.loginPlayer(playerData).isEmpty()){
            return Optional.ofNullable(playerDataService.savePlayer(playerData));
        }
        else {
            return playerDataService.loginPlayer(playerData);
        }
    }

    @RequestMapping(value = "/withdraw", method = RequestMethod.POST)
    public void withdraw(@RequestBody Transactions transactions){
        PlayerData playerData = playerDataService.getById(transactions.getPlayerData());
        playerDataService.updateCashWithdraw(transactions,playerData);
    }

    @RequestMapping(value = "/deposit", method = RequestMethod.POST)
    public PlayerData deposit(@RequestBody Transactions transactions){
        PlayerData playerData = transactions.getPlayerData();
        return playerDataService.updateCashDeposit(transactions,playerData);
    }

}
