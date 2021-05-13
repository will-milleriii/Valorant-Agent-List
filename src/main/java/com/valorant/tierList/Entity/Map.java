package com.valorant.tierList.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Map {
    @Id
    @GeneratedValue
    private long mapId;
    private String name;
    private String location;
    private int bombSites;
    private String feature;

    public Map(){};

    public Map(long mapId, String name, String location, int bombSites, String feature) {
        this.mapId = mapId;
        this.name = name;
        this.location = location;
        this.bombSites = bombSites;
        this.feature = feature;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBombSites() {
        return bombSites;
    }

    public void setBombSites(int bombSites) {
        this.bombSites = bombSites;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
