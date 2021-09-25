package com.kodilla.exception.test;

public class LetsFly {

    public static void main(String[] args) {
        Flight flight = new Flight("Rzeszów", "NYC");
        Flight flight2 = new Flight("NYC", "NYC");
        Flight flight3 = new Flight("Warszawa", "Lublin");
        FindFlight flightSearcher = new FindFlight();

        try {
            flightSearcher.findFlight(flight);
            flightSearcher.findFlight(flight2);
            flightSearcher.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Can't fly to this airport.");
        }
    }
}
