package com.kodilla.exception.test;

public class ExceptionHandling {
    public void handleProbablyIWillThrowException(double x, double y){
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(x, y);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Finish");
        }

    }
}
