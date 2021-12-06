package com.health.tracker;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alarm")
public class Alarm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Date alarmDate;

    @Column(nullable = false)
    private Time alarmTime;

    // SETTERS AND GETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return alarmDate;
    }

    public void setDate(Date alarmDate) {
        this.alarmDate = alarmDate;
    }

    public Time getTime() {
        return alarmTime;
    }

    public void setTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

}