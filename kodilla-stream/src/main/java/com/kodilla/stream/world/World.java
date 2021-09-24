package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent>countriesList = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return countriesList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal numberOfPeople = countriesList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));

        return numberOfPeople;
    }
}
