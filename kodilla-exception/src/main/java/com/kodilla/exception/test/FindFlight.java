package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlight {

    private final Map<String, Boolean> flightMap;

    public FindFlight() {
        this.flightMap = new HashMap<>();
        flightMap.put("Rzeszów", true);
        flightMap.put("Lublin", false);
        flightMap.put("Warszawa", false);
        flightMap.put("Manchester", true);
        flightMap.put("NYC", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (flight.getDepartureAirport().equals(flight.getArrivalAirport())) {
            System.out.println("It's impossible to fly to the same airport.");
            return;
        }

        List<String> flights = flightMap.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (flights.contains(flight.getDepartureAirport()) && flights.contains(flight.getArrivalAirport())) {

            System.out.println("Your flight is from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + '.');

        } else {

            throw new RouteNotFoundException();
        }
    }
}
