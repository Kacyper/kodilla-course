package com.kodilla.kodillagoodpatterns.flights;

import com.kodilla.kodillagoodpatterns.flights.flight.FlightRespository;
import com.kodilla.kodillagoodpatterns.flights.search.Search;
import com.kodilla.kodillagoodpatterns.flights.search.SearchResults;

public class FlightApplication {

    public static void main(String[] args) {

        FlightRespository flightRespository = new FlightRespository();
        Search searching = new Search(flightRespository);

        SearchResults search1 = new SearchResults(searching.searchFromDestination("Gdansk"));
        SearchResults search2 = new SearchResults(searching.searchArrival("Cracow"));
        SearchResults search3 = new SearchResults(searching.searchVia("Warsaw", "Gdansk", "Lublin"));

        System.out.println();
        search1.showSearchResults();
        System.out.println();
        search2.showSearchResults();
        System.out.println();
        search3.showSearchResults();

    }

}
