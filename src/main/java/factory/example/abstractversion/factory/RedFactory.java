package factory.example.abstractversion.factory;


public class RedFactory extends Factory {
    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK: {
                return new Tank(220, 0, 15);
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
                return new Soldier(110, 0, 8);
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
                return new Plane(60, 0, 12);
            }
            default: {
                throw new UnsupportedOperationException("Incorrect type");
            }
        }    }
}
