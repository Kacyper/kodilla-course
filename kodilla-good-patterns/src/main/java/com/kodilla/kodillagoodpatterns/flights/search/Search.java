package com.kodilla.kodillagoodpatterns.flights.search;

import com.kodilla.kodillagoodpatterns.flights.flight.Flight;
import com.kodilla.kodillagoodpatterns.flights.flight.FlightRespository;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    private final FlightRespository flightRespository;

    public Search(FlightRespository flightRespository) {
        this.flightRespository = flightRespository;
    }

    public Set<Flight> searchFromDestination(String destination) {
        return flightRespository.getFlights().stream()
                .filter(f -> f.getDestination().equals(destination))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchArrival(String arrival) {
        return flightRespository.getFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchVia(String destination, String arrival, String via) {

        Set<Flight> searchResult = flightRespository.getFlights().stream()
                .filter(f -> f.getDestination().equals(destination) && f.getArrival().equals(arrival) || (f.getDestination().equals(via) && f.getArrival().equals(arrival)))
                .collect(Collectors.toSet());

        if (searchResult.size() != 2) {
            searchResult.clear();
        }
        return  searchResult;
    }


}
