package observer.training.notification;

import observer.training.weather.WeatherForecast;

public interface Observer {

    void notify(WeatherForecast weatherForecast);
}
