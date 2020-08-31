package com.plantpocalypse;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Room currentRoom; // Might change to Room type
    private int movesMade;
    private int totalHealth;
    private int currentHealth;
    private List<Item> inventory;


    public Player(Room startingLocation) {
//        System.out.println("Setting player current location to: " + startingLocation.getName());
        currentRoom = startingLocation;
        inventory = new ArrayList<Item>();
    }

    public void pickUpItem(String itemName){
        Item pickedUpItem = currentRoom.getItem(itemName);
        inventory.add(pickedUpItem);
        System.out.println("picked up " + inventory.get(0).getName());
    }

    public void move(Room nextRoom) {
        this.currentRoom = nextRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getMovesMade() {
        return movesMade;
    }

    public void setMovesMade(int movesMade) {
        this.movesMade = movesMade;
    }

    public int getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory() {
        this.inventory = inventory;
    }
}
