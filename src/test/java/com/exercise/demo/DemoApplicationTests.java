package com.exercise.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Test class
 *
 * Not testing enum classes as enums don't have behavior.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hello l3ads");
	}

	@Test
	public void testShuffle(){
		Deck deck1 = new Deck();
		deck1.shuffleDeck();

		Deck deck2 = new Deck();
		deck2.shuffleDeck();

		assertThat(deck1.getDeckOfCards(), not(equalTo(deck2.getDeckOfCards())));
		// i.e....
		assertArrayEquals(deck1.getDeckOfCards(), deck1.getDeckOfCards());
	}

	@Test
	public void testDealOne() {
		Deck deck = new Deck();

		// Make sure no one messed with our constant!!
		assertEquals(Deck.NUM_CARDS, 52);

		deck.dealCard();
		assertEquals(deck.getCardsDealt(), 1);
	}

	@Test
	public void testDeal52Cards() {
		Deck deck = new Deck();

		for(int i = 0; i < Deck.NUM_CARDS; i++){
			Card c = deck.dealCard();
		}

		assertEquals(deck.getCardsDealt(), Deck.NUM_CARDS);

		// Should not return a card if already dealt all 52
		assertNull(deck.dealCard());
	}

}
