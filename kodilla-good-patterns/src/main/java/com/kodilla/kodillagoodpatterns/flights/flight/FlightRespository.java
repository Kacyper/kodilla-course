package com.kodilla.kodillagoodpatterns.flights.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRespository {

    private final List<Flying> flights = new ArrayList<>();

    public FlightRespository() {

        flights.add(new Flying("Warsaw", "Cracow"));
        flights.add(new Flying("Warsaw", "Lublin"));
        flights.add(new Flying("Lublin", "Gdansk"));
        flights.add(new Flying("Gdansk", "Warsaw"));
        flights.add(new Flying("Warsaw", "Gdansk"));
        flights.add(new Flying("Warsaw", "Wroclaw"));
        flights.add(new Flying("Szczecin", "Warsaw"));
        flights.add(new Flying("Szczecin", "Lublin"));
        flights.add(new Flying("Warsaw", "Szczecin"));
        flights.add(new Flying("Gdansk", "Lublin"));
        flights.add(new Flying("Gdansk", "Szczecin"));
        flights.add(new Flying("Szczecin", "Cracow"));

    }

    public List<Flying> getFlights() {
        return flights;
    }
}
