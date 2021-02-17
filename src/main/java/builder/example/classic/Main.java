package builder.example.classic;

import builder.example.classic.house.BigHouseBuilder;
import builder.example.classic.house.House;
import builder.example.classic.house.HouseDirector;
import builder.example.classic.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();
        House smallHouse = smallHouseDirector.getHouse();
        System.out.println(smallHouse);

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();
        House bigHouse = bigHouseDirector.getHouse();
        System.out.println(bigHouse);

    }
}
