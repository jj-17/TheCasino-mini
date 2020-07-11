package com.codedifferently.casino;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    Deck deck =new Deck();
    @Test
    public void sizeTest() {
        assertEquals(52,deck.numCards());
    }
    @Test
    public void ShuffleTest() {
        Deck shuffledDeck = new Deck();
        assertEquals(deck.toString(),shuffledDeck.toString());
        deck.shuffle();
        assertNotEquals(deck.toString(),shuffledDeck.toString());
        shuffledDeck.shuffle();
        assertNotEquals(deck.toString(),(shuffledDeck.toString()));
    }
    @Test
    public void dealTest() {
        Deck difDeck=new Deck();
        deck.dealTopCard();
        assertEquals(51,deck.numCards());
        assertNotEquals(difDeck,deck);
        deck.deal(7);
        assertEquals(44,deck.numCards());
    }
}
