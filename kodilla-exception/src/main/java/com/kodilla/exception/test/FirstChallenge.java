package com.kodilla.exception.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();


        try  {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("Magic.");
        }
    }
}