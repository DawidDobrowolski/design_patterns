package observer.training.notification;

import observer.training.weather.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void notify(WeatherForecast weatherForecast) {
        System.out.println("INTERNET NEWS: today temperature is " + weatherForecast.getTemperature() + " and air pressure: " + weatherForecast.getPressure());
    }
}
