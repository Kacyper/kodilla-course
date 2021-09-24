package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countriesList = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesList() {
        return new ArrayList<>(countriesList);
    }

    public boolean addCountry (Country country){
        return countriesList.add(country);
    }
}
