package com.engeto.urm.ukolHotel;

import java.math.BigDecimal;

public class Room {

    private int roomId;
    private int numberOfBeds;
    private boolean balcony;
    private boolean viewOfSea;
    private BigDecimal price;

    public Room(int roomId, int numberOfBeds, boolean balcony, boolean viewOfSea, BigDecimal price) {
        this.roomId = roomId;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.viewOfSea = viewOfSea;
        this.price = price;
    }

    // Nothing to add, typical automatically generated constructor, getters and setters...

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isViewOfSea() {
        return viewOfSea;
    }

    public void setViewOfSea(boolean viewOfSea) {
        this.viewOfSea = viewOfSea;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // using big decimal for precision, cannot lose a cent !

    public String getDescriptionView(){
        if (viewOfSea){
            return "has";
        }
        else return "doesn't have";
    }

    public String getDescriptionBalcony(){
        if (balcony){
            return "has";
        }
        else return "doesn't have";
    }
        // getting ready for getDescription() aka fake toString()
    public String getDescription(){
        return "Room " + roomId + " with " + numberOfBeds + " beds " + getDescriptionView() + " a view of the sea and " + getDescriptionBalcony() + " a balcony.";
    }

}
