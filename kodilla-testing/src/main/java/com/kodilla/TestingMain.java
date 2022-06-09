package com.kodilla;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if(calculator.add(5,6)==11){
            System.out.println("Adding works correctly!");
        }
        else{
            System.out.println("Adding doesn't work.");
        }
        if(calculator.subtract(11,6)==5){
            System.out.println("Subtracting works correctly!");
        }
        else{
            System.out.println("Subtracting doesn't work.");
        }
    }
}