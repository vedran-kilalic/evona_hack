package com.team3.evona.service;

import com.team3.evona.models.PlayerAchievements;
import com.team3.evona.models.Player;
import com.team3.evona.models.Transactions;
import com.team3.evona.repository.PlayerAchievementsRepo;
import com.team3.evona.repository.PlayerDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerDataService {

    @Autowired
    PlayerDataRepo playerDataRepo;

    @Autowired
    PlayerAchievementsRepo playerAchievementsRepo;

    public List<Player> getPlayerData(){
        return playerDataRepo.findAll();
    }

    public Optional<Player> loginPlayer(Player player){
       return playerDataRepo.findById(player.getId());
    }

    public Player getPlayerById(Player player){
        Player player1 = playerDataRepo.getById(player.getId());
        return player1;
    }

    public List<Player> getAllPlayer(){
       return playerDataRepo.findAll();
    }

    public void savePlayer(Player player){
        player.setPoints(player.getPoints() + 20);
        playerDataRepo.save(player);
        PlayerAchievements playerAchievements = new PlayerAchievements();
        playerAchievements.setPlayerId(player.getId());
        playerAchievements.setAchievementId(1);
        playerAchievements.setCurrentPoints(20);
        playerAchievements.setCollected(true);
        playerAchievementsRepo.save(playerAchievements);
    }

    public void updateCashWithdraw(Transactions transactions, Player player1){
        Player player = playerDataRepo.findById(player1.getId()).get();
        double amountToTransfer = transactions.getAmount();


                if(amountToTransfer > 0 && amountToTransfer<80) {
                    player.setPoints(player.getPoints() + 40);
                }
                else if(amountToTransfer > 79 && amountToTransfer<400) {
                    player.setPoints(player.getPoints() + 60);
                }

                else if(amountToTransfer > 399 && amountToTransfer<600){
                    player.setPoints(player.getPoints() + 80);
                }

                else if(amountToTransfer > 599){
                    player.setPoints(player.getPoints() + 100);
                }
        playerDataRepo.save(player);
        }

    public void updateCashDeposit(Transactions transactions, Player player1){
        Player player = playerDataRepo.findById(player1.getId()).get();
        double amountToTransfer = transactions.getAmount();


        if(amountToTransfer > 0 && amountToTransfer<80) {
            player.setPoints(player.getPoints() + 40);
        }
        else if(amountToTransfer > 79 && amountToTransfer<400) {
            player.setPoints(player.getPoints() + 60);
        }

        else if(amountToTransfer > 399 && amountToTransfer<600){
            player.setPoints(player.getPoints() + 80);
        }

        else if(amountToTransfer > 599){
            player.setPoints(player.getPoints() + 100);
        }
        playerDataRepo.save(player);
    }
}
