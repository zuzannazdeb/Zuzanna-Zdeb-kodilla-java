package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When giving an empty list to exterminate method it should return empty list.")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = exterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(result.size(), emptyList.size());
    }
    @DisplayName("When giving an normal list to exterminate method it should delete all odd numbers.")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(6);
        normalList.add(8);
        normalList.add(3);
        normalList.add(5);
        //When
        List<Integer> result = exterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(result.size(), 2);
    }
}
