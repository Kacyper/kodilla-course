package com.kodilla.kodillagoodpatterns.flights.search;

import com.kodilla.kodillagoodpatterns.flights.flight.Flight;

import java.util.Set;

public class SearchResults {

    private final Set<Flight> resultSet;

    public SearchResults(Set<Flight> resultSet) {
        this.resultSet = resultSet;
    }

    public void showSearchResults() {

        resultSet.stream()
                .map(flight -> flight.getDestination() + " -> " + flight.getArrival())
                .forEach(System.out::println);
    }
}
