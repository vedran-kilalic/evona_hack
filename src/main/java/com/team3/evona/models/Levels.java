package com.team3.evona.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "levels")
public class Levels {

    @Id
    int id;

    @Column(name = "rangeFrom")
    int rangeFrom;

    @Column(name = "rangeTo")
    int rangeTo;

    @Column(name = "levelName")
    String levelName;

    @Column(name = "points")
    int points;

    public Levels(int id, int rangeFrom, int rangeTo, String levelName, int points) {
        this.id = id;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
        this.levelName = levelName;
        this.points = points;
    }

    public Levels() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(int rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(int rangeTo) {
        this.rangeTo = rangeTo;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
