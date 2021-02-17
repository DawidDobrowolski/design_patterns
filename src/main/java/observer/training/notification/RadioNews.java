package observer.training.notification;

import observer.training.weather.WeatherForecast;

public class RadioNews implements Observer{

    @Override
    public void notify(WeatherForecast weatherForecast) {
        System.out.println("RADIO NEWS: today temperature is " + weatherForecast.getTemperature() + " and air pressure: " + weatherForecast.getPressure());
    }
}
