package com.exercise.demo;

/**
 * Enumeration defines the possible ranks for a playing card.
 * @author samantha domvillle
 */

// Ace, 2-10, Jack, Queen, and King
public enum Rank {
    ACE("Ace"),
    TWO("Two"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    private String name;

    Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

