package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEachTest() {
        Map<String, Double> temperatureMap = new HashMap<>();
        temperatureMap.put("Rzeszow", 25.5);
        temperatureMap.put("Krakow", 26.2);
        temperatureMap.put("Wroclaw", 24.8);
        temperatureMap.put("Warszawa", 25.2);
        temperatureMap.put("Gdansk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperatureMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Calculating average temperature - test")
    @Test
    void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageOfTemperature = weatherForecast.calculateAverageTemperature(temperaturesMock.getTemperatures());

        //Then
        assertEquals(25.56, averageOfTemperature);
    }

    @DisplayName("Calculating median temperature - test")
    @Test
    void testCalculateMedianTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.calculateMedianTemperature(temperaturesMock.getTemperatures());

        //Then
        assertEquals(25.5, median);
    }
}