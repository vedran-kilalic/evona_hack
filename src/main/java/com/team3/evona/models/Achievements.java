package com.team3.evona.models;

import javax.persistence.*;

@Entity
@Table(name = "achievements")
public class Achievements {

    @Id
    @Column(name = "achId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int achId;

    @Column(name = "achPoints")
    int achPoints;

    @Column(name = "achName")
    String achName;

    @Column(name = "type")
    int type;

    public Achievements(int achId, int achPoints, String achName, int type) {
        this.achId = achId;
        this.achPoints = achPoints;
        this.achName = achName;
        this.type = type;
    }

    public Achievements() {}

    public int getAchId() {
        return achId;
    }

    public void setAchId(int achId) {
        this.achId = achId;
    }

    public int getAchPoints() {
        return achPoints;
    }

    public void setAchPoints(int achPoints) {
        this.achPoints = achPoints;
    }

    public String getAchName() {
        return achName;
    }

    public void setAchName(String achName) {
        this.achName = achName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
