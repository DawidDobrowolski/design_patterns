package factory.training.factory;

public class CommonwealthFactory extends Factory {
    @Override
    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5: {
                return new BMW(2998, "ON", 2014, SteeringWheelPosition.LEFT);
            }
            case E62: {
                return new BMW(1997, "Pb", 1994, SteeringWheelPosition.LEFT);
            }
            default: {
                throw new UnsupportedOperationException("Wrong BMW Model");
            }
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel) {
            case Focus: {
                return new Ford(2998, "ON", 2014, SteeringWheelPosition.LEFT);
            }
            case Mondeo: {
                return new Ford(1997, "Pb", 1994, SteeringWheelPosition.LEFT);
            }
            default: {
                throw new UnsupportedOperationException("Wrong BMW Model");
            }
        }
    }
}
