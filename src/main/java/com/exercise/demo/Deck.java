package com.exercise.demo;

import java.util.Random;

/**
 * This factory class represents a standard deck of 52 cards. It is initially in order
 * of suit and rank and can be shuffled providing a randomly ordered deck.
 * @author samantha domville
 */
public class Deck {

    public static final int NUM_CARDS = 52;
    private int cardsDealt = 0;
    private Card[] deckOfCards;

    public Deck() {
        deckOfCards = new Card[NUM_CARDS];
        int counter = 0;

        // init the deck
        for(Suit s : Suit.values()) {
            for(Rank r : Rank.values()) {
                deckOfCards[counter++] = new Card(s, r);
            }
        }
    }

    public void shuffleDeck() {
        // Use the Fisher-Yates shuffle algorithm
        int index;
        Card temp;
        Random random = new Random();
        for (int i = deckOfCards.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = deckOfCards[index];
            deckOfCards[index] = deckOfCards[i];
            deckOfCards[i] = temp;
        }
    }

    public Card dealCard() {
        System.out.println(cardsDealt);
        return cardsDealt < NUM_CARDS ? deckOfCards[cardsDealt++] : null;
    }

    public Card[] getDeckOfCards(){
        return deckOfCards;
    }

    public int getCardsDealt() {
        return cardsDealt;
    }
}
