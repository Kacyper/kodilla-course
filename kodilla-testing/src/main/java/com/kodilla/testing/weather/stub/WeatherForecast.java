package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private final Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature(Map<String, Double> temperatureMap) {

        double resultOfAverage = 0;
        for (Double temperature : temperatures.getTemperatures().values()) {
            resultOfAverage += temperature;
        }
        return resultOfAverage / (double) temperatureMap.size();
    }
    public double calculateMedianTemperature(Map<String, Double> temperatureMap) {

        List<Double> listOfTemp = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatureMap.entrySet()) {
            listOfTemp.add(temperature.getValue());
        }

        Collections.sort(listOfTemp);
        double median;

        if (listOfTemp.size() % 2.0 == 0)
            median = (listOfTemp.get((int) (listOfTemp.size() / 2.0)) + listOfTemp.get((int) (listOfTemp.size() / 2.0)));
        else {
            median = listOfTemp.get((int) (listOfTemp.size() / 2.0));
        }
        return median;
    }
}