package com.example;

public class ObservablePattern {

    public static void main(String[] args) {
        WeatherDataObservable weatherData = new WeatherDataObservable();

        //CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplayObserver currentConditionsDisplayObserver = new CurrentConditionsDisplayObserver(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
