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

    public PlayerData(String id, String username, int points, int levelId) {
        this.id = id;
        this.username = username;
        this.points = points;
        this.levelId = levelId;
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
}
