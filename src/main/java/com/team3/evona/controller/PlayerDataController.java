package com.team3.evona.controller;

import com.team3.evona.models.PlayerData;
import com.team3.evona.service.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PlayerDataController {

    @Autowired
    PlayerDataService playerDataService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public PlayerData login(@RequestBody PlayerData playerData){
        return playerDataService.loginPlayer(playerData);
    }

}
