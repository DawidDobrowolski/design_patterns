package factory.example.abstractversion.factory;


public class BlueFactory extends Factory {
    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK: {
                return new Tank(200, 0, 20);
            }
            default: {
                throw new UnsupportedOperationException("Incorrect type");
            }
        }
    }

    @Override
    public HumanUnit createHumanUnit(UnitType unitType) {
        switch (unitType) {
            case SOLDIER: {
                return new Soldier(100, 0, 10);
            }
            default: {
                throw new UnsupportedOperationException("Incorrect type");
            }
        }
    }

    @Override
    public FlyingUnit createFlyingUnit(UnitType unitType) {
        switch (unitType) {
            case PLANE: {
                return new Plane(50, 0, 20);
            }
            default: {
                throw new UnsupportedOperationException("Incorrect type");
            }
        }    }
}
