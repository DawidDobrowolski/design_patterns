package factory.example.classicversion;

import factory.example.classicversion.factory.*;

public class Main {

    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.SOLDIER);
    }
}
