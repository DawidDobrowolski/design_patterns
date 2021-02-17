package builder.example.inner;

import builder.example.inner.house.House;

public class Main {

    public static void main(String[] args) {

        House house1 = new House("walls", "floors", "rooms", "roof", "windows", "doors");
        House house2 =  new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRooms("rooms")
                .buildRoof("roof")
                .buildWindows("windows")
                .buildDoors("doors")
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
