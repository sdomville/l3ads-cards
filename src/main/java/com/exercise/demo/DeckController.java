package com.exercise.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeckController {

    private static Deck deckOfCards;

    @RequestMapping("/shuffle")
    public String shuffle() {
        deckOfCards = new Deck();
        deckOfCards.shuffleDeck();
        return "Deck of Cards Shuffled. Go back to deal a card.";
    }

    @RequestMapping("/deal")
    public String deal() {
        if(deckOfCards == null){
            return "Please shuffle the deck first.";
        }
        Card card = deckOfCards.dealCard();
        String str = card != null ? "Card " + deckOfCards.getCardsDealt() + ": " + card.toString() : "No cards left.";
        return str;
    }

}
