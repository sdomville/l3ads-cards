package com.exercise.demo;

/**
 * Suit enum represents the possible suits in a deck of cards.
 * @author samantha domville
 */
public enum Suit {

    HEART("Hearts"),
    DIAMOND("Diamonds"),
    CLUB("Clubs"),
    SPADE("Spades");

    private String name;

    Suit(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
