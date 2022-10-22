package com.team3.evona.models;

import javax.persistence.*;

@Entity
@Table(name = "PlayerData")
public class PlayerData {

    @Id
    @Column(name = "id")
    String id;

    @Column(name = "username")
    String username;

    @Column(name = "points")
    int points;

    @Column(name = "levelId")
    int levelId;

    @Column(name = "cash")
    double cash;

    public PlayerData(String id, String username, int points, int levelId, double cash) {
        this.id = id;
        this.username = username;
        this.points = points;
        this.levelId = levelId;
        this.cash = cash;

    }

    public PlayerData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
