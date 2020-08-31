package com.plantpocalypse;

import java.util.HashMap;

public class Room {
    private String name;  //name of room
    private HashMap<String, Room> neighboringRooms; //names of neighboring rooms
    //private String description;  //short descr
    private HashMap<String, Item> items = new HashMap<String, Item>(); //items in the room

    public void addItem(String itemName, Item item){
        items.put(itemName, item);
    }

    public Item getItem(String itemName){
        Item pickedUpItem = items.get(itemName);
        items.remove(itemName);
        return pickedUpItem;
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(String name, HashMap<String, Room> neighboringRooms) {
        this.name = name;
        this.neighboringRooms = neighboringRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Room> getNeighboringRooms() {
        return neighboringRooms;
    }

    public void setNeighboringRooms(HashMap<String, Room> neighboringRooms) {
        this.neighboringRooms = neighboringRooms;
    }
}
