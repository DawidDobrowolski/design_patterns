package factory.example.abstractversion;

import factory.example.abstractversion.factory.*;

public class Main {

    public static void main(String[] args) {
        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        HumanUnit redSoldier = redFactory.createHumanUnit(UnitType.SOLDIER);
        FlyingUnit redPlane = redFactory.createFlyingUnit(UnitType.PLANE);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        HumanUnit blueSoldier = blueFactory.createHumanUnit(UnitType.SOLDIER);
        FlyingUnit bluePlane = blueFactory.createFlyingUnit(UnitType.PLANE);
    }
}
