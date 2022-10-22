package com.team3.evona.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playerAchievements")
public class PlayerAchievements {

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "playerId")
    String playerId;

    @Column(name = "achievementId")
    int achievementId;

    @Column(name = "currentPoints")
    int currentPoints;

    @Column(name = "isCollected")
    boolean isCollected;

    public PlayerAchievements() {}

    public PlayerAchievements(int id, String playerId, int achievementId, int currentPoints, boolean isCollected) {
        this.id = id;
        this.playerId = playerId;
        this.achievementId = achievementId;
        this.currentPoints = currentPoints;
        this.isCollected = isCollected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(int achievementId) {
        this.achievementId = achievementId;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public boolean isCollected() {
        return isCollected;
    }

    public void setCollected(boolean collected) {
        isCollected = collected;
    }
}