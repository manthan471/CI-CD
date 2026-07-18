package com.model;

public class Adress {

    private int laneNumber;
    private String colony;
    private String city;

    public Adress() {}

    public Adress(int laneNumber, String colony, String city) {
        this.laneNumber = laneNumber;
        this.colony = colony;
        this.city = city;
    }

    public int getLaneNumber() {
        return laneNumber;
    }

    public void setLaneNumber(int laneNumber) {
        this.laneNumber = laneNumber;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String toString() {
    	return laneNumber+" "+colony+" "+city;
    	
    }
}
