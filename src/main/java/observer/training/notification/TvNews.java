package observer.training.notification;

import observer.training.weather.WeatherForecast;

public class TvNews implements Observer{

    @Override
    public void notify(WeatherForecast weatherForecast) {
        System.out.println("TV NEWS: today temperature is " + weatherForecast.getTemperature() + " and air pressure: " + weatherForecast.getPressure());
    }
}
