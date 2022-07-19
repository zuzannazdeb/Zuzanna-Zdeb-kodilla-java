package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("83240000"));
        Country japan = new Country("Japan", new BigDecimal("125800000"));
        Country china = new Country("China", new BigDecimal("1402000000"));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        europe.addToCountryList(poland);
        europe.addToCountryList(germany);
        asia.addToCountryList(japan);
        asia.addToCountryList(china);

        World world = new World();
        world.addToContinentList(europe);
        world.addToContinentList(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("1649040000");
        assertEquals(expectedPeople, result);
    }
}
