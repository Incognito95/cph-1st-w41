package task2;

import java.util.ArrayList;

// 2d
public class Building {
    private ArrayList<Room>list = new ArrayList<Room>();
    private final Room rooms;
    private final int numberOfRooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;

    // 2e - constructor that populates all the fields
    public Building(Room rooms, int numberOfRooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    // 2e - getters for each of the fields
    public Room getRooms() {
        return rooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding() {
        return isOfficeBuilding;
    }

    public ArrayList<Room> getList() {
        return list;
    }
}