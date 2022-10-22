package com.team3.evona.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "userLog")
public class UserLog {

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "userId")
    int userId;

    @Column(name = "logTime")
    Date logTime;

    public UserLog(int id, int userId, Date logTime) {
        this.id = id;
        this.userId = userId;
        this.logTime = logTime;
    }

    public UserLog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}
