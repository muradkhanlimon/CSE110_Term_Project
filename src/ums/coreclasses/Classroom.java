package ums.coreclasses;

import java.util.HashMap;

public class Classroom {
    
    private int    id;
    private String building;
    private int    roomNumber;
    private int    capacity;

    HashMap<Integer, Timeslot> timeslots = new HashMap<>();
    
    public Classroom(int id, String building, int roomNumber, int capacity) {
        this.id = id;
        this.building = building;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void addTimeslot(Timeslot t) {
        timeslots.put(t.getId(), t);
    }
    
    public void removeTimeslot(Timeslot t) {
        timeslots.remove(t.getId(), t);
    }
    
}//Classroom class ends
