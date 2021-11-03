package com.kodilla.kodillagoodpatterns.flights.flight;

import java.util.Objects;

public class Flying implements Flight {

    private final String destination;
    private final String arrival;

    public Flying(String destination, String arrival) {
        this.destination = destination;
        this.arrival = arrival;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(destination, flying.destination) && Objects.equals(arrival, flying.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, arrival);
    }
}
