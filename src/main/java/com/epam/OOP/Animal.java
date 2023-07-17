package com.epam.OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawsNoun;
        String furPresence;

        if (numberOfPaws > 1) {
            pawsNoun = "paws";
        } else pawsNoun = "paw";

        if (hasFur) {
            furPresence = "a";
        } else furPresence = "no";

        return "This animal is mostly " +
                color +
                ". It has " +
                numberOfPaws +
                " " +
                pawsNoun +
                " and " +
                furPresence +
                " fur.";
    }

}
