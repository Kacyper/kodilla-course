package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {

        String textAfter = poemDecorator.decorate(text);
        System.out.println("Text: " + text + "\nDecorated text: " + textAfter);
    }
}