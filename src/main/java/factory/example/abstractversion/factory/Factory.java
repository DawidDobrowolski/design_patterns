package factory.example.abstractversion.factory;

public abstract class Factory {

    public abstract MechanizedUnit createMechanizedUnit(UnitType unitType);
    public abstract HumanUnit createHumanUnit(UnitType unitType);
    public abstract FlyingUnit createFlyingUnit(UnitType unitType);
}
