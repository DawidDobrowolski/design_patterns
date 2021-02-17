package factory.training.factory;

public abstract class Car {

    private int engineSize;
    private String fuelType;
    private int productionYear;
    private SteeringWheelPosition steeringWheelPosition;

    protected Car(int engineSize, String fuelType, int productionYear, SteeringWheelPosition steeringWheelPosition) {
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
