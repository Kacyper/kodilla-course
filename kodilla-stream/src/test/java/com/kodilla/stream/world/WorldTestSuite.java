package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");

        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country spain = new Country("Spain");
        Country china = new Country("China");
        Country korea = new Country("Korea");
        Country aussie = new Country("Australia");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(australia);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(spain);

        asia.addCountry(china);
        asia.addCountry(korea);

        australia.addCountry(aussie);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("7404738");
        Assertions.assertEquals(totalPeopleExpected, totalPeople);
    }
}