package ir.mehrad.weather.weather;

import ir.mehrad.weather.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeatherStatus {
    public Main main;
    public List<Weather> weather;
    public String base;
    public int visibility;
    public int dt;
    public int timezone;
    public int id;
    public String name;
    public int cod;
    public String city;

    public Location location;
    public Current current;
    public Forecast forecast;

    public WeatherStatus(Main main ,String name, List<Weather> weather) {
        this.main=main;
        this.name = name;
        this.weather = weather;
    }

    public WeatherStatus(Forecast forecast, Location location) {
        this.forecast = forecast;
        this.location = location;
    }

    public WeatherStatus() {
    }

    public WeatherStatus(String message) {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
