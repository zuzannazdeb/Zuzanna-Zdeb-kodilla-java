package com.kodilla.lambda;

import com.kodilla.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("aaaaa", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("aaaaa", (text) -> text.toUpperCase());
        poemBeautifier.beautify("aaaaa", (text) -> text.replaceAll("a", "b"));
        poemBeautifier.beautify("aaaaa", (text) -> text.toLowerCase());

        poemBeautifier.beautify("Asloden", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Asloden", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Asloden", (text) -> text.replaceAll("A", "b"));
        poemBeautifier.beautify("Asloden", (text) -> text.toLowerCase());



    }
    }
