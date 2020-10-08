package task2;

import java.util.ArrayList;

// 2g
public class Main {
    public static void main (String [] args) {
    Room room1 = new Room("blah3", 2, 3, 4);
    Room room2 = new Room("blah3", 2, 3, 4);
    Room room3 = new Room("blah3", 2, 3, 4);


    Building building1 = new Building(room1, 5, 6, false);

    building1.getList().add(room1);
    building1.getList().add(room2);
    building1.getList().add(room3);

    // 2h, 2i
    int sum = room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps();

    // 2j
    System.out.println("Number of lamps is " + sum);


    // 2k
    if (building1.getNumberOfFloors() > building1.getNumberOfRooms()) {
        System.out.println("This is an odd building");
    }

    }

}
