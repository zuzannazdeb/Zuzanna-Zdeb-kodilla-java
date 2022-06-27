package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator lambda){
        String result = lambda.decorate(text);
        System.out.println(result);
    }
}
