package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        //When
        double resultAdd = calculator.add(8,2);
        double resultSub = calculator.sub(15,1);
        double resultMul = calculator.mul(2,10);
        double resultDiv = calculator.div(63,7);
        //Then
        assertEquals(10, resultAdd);
        assertEquals(14, resultSub);
        assertEquals(20, resultMul);
        assertEquals(9, resultDiv);
    }
}