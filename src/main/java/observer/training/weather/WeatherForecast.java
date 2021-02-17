package observer.training.weather;

import observer.training.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{

    int temperature;
    int pressure;
    Set<Observer> registeredObservers;

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.registeredObservers =  new HashSet<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.registeredObservers.forEach(o -> o.notify(this));
    }

    public void updateForecast(int temperature, int pressure) {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}
