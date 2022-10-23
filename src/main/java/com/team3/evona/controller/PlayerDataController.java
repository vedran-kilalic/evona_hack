package com.team3.evona.controller;

import com.team3.evona.models.Player;
import com.team3.evona.models.Transactions;
import com.team3.evona.service.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController

public class PlayerDataController {

    @Autowired
    PlayerDataService playerDataService;

    @GetMapping("/")
    public ModelAndView homePage(){
        return new ModelAndView("evona.html");
    }
    @GetMapping("/login")
    public ModelAndView homeLogin(){
        return new ModelAndView("evona.html");
    }

    @GetMapping(value = "/all")
    public List<Player> getAll(){
       return playerDataService.getAllPlayer();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestBody Player player){
        if (playerDataService.loginPlayer(player).isEmpty()){
            playerDataService.savePlayer(player);
        }
        else {
            playerDataService.loginPlayer(player);
        }
    }


    @RequestMapping(value = "/withdraw", method = RequestMethod.POST)
    public void withdraw(@RequestBody Transactions transactions){
        playerDataService.updateCashWithdraw(transactions, transactions.getPlayerData());
    }

    @RequestMapping(value = "/deposit", method = RequestMethod.POST)
    public void deposit(@RequestBody Transactions transactions){
        Player player = playerDataService.getPlayerById(transactions.getPlayerData());
        playerDataService.updateCashDeposit(transactions, player);
    }

}
