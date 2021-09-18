package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(final String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Nic dwa razy - W.Szymborska\n");

        poemBeautifier.beautify("Nic dwa razy się nie zdarza i nie zdarzy.", (textToBeautify -> "ABC_" + textToBeautify + "_ABC\n"));
        poemBeautifier.beautify("Z tej przyczyny zrodziliśmy się bez wprawy i pomrzemy bez rutyny.", String::toUpperCase);
        poemBeautifier.beautify("Choćbyśmy uczniami byli najtępszymi w szkole świata,", String::toLowerCase);
        poemBeautifier.beautify("nie będziemy repetować żadnej zimy ani lata.", textToBeautify -> "_****_" + textToBeautify + "_####_");
   }
}