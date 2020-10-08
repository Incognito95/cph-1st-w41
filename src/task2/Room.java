package task2;

// 2a
public class Room {
    private final String wall;
    private final int numberOfDoors;
    private final int numberOfLamps;
    private final int numberOfWindows;

    // 2b - constructor that populates all fields
    public Room(String wall, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.wall = wall;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // 2c - getters for each of the fields
    public String getWalls() {
        return wall;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
