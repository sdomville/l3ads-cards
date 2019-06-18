package com.exercise.demo;

/**
 * Class represents a playing card which has a suit and a rank.
 * @author samantha domville
 */
public class Card {

    private Suit suit;
    private Rank rank;

    /**
     * Creates a card object with the suit and rank specified.
     * @param suit The card's suit
     * @param rank The card's rank
     */
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Override of Object toString()
     * @return String the text representation of the object
     */
    public String toString() {
        return this.rank.getName() + " of " + this.suit.getName();
    }

}
