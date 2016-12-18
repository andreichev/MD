package ru.ProPoisk.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 18.12.16.
 */
public class Journey {
    private int id;
    private String name;
    private boolean status;
    private String place;
    private List<Squad> squads;
    private List<User> participants;

    public Journey(int id, String name, boolean status, String place, List<Squad> squads, List<User> participants){
        this.id = id;
        this.name = name;
        this.status = status;
        this.place = place;
        this.squads = squads;
        this.participants = participants;
    }

    public Journey(int id, String name, boolean status, String place){
        this.id = id;
        this.name = name;
        this.status = status;
        this.place = place;
        this.squads = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public String getPlace() {
        return place;
    }

    public List<Squad> getSquads() {
        return squads;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setSquads(List<Squad> squads) {
        this.squads = squads;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }
}
