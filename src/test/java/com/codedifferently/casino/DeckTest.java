package com.codedifferently.casino;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck =new Deck();
    @Test
    public void constructorTest() {
        assertEquals(52,deck.length());
    }
}
