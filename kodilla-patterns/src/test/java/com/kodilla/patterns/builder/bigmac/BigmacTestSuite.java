package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Thin")
                .sauce("Barbecue")
                .burgers(4)
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Chilli peppers")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();
        //Then
        assertEquals(4, howManyIngredients);
        assertEquals(4, howManyBurgers);
        assertEquals("Barbecue", whatSauce);
        assertEquals("Thin", whatBun);
    }
}