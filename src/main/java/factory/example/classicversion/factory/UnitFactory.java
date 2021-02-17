package factory.example.classicversion.factory;

public class UnitFactory extends Factory{

    @Override
    public Unit createUnit(UnitType unitType) {
        switch(unitType){
            case TANK:{
                return new Tank(200, 0, 20);
            }
            case SOLDIER:{
                return new Soldier(100, 0, 10);
            }
            default:{
                throw new UnsupportedOperationException("Type is not known");
            }
        }
    }
}
