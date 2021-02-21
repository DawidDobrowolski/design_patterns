package adapter.example.adapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {

    private ContinentalDevice continentalDevice;
    private UKDevice ukDevice;

    public TwoWayAdapter(ContinentalDevice continentalDevice, UKDevice ukDevice) {
        this.continentalDevice = continentalDevice;
        this.ukDevice = ukDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }
}
