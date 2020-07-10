package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class CardTest {

    Card test = new Card(Card.Suite.CLUBS, Card.Rank.FOUR);

    @Test
    public void getRank() {

        Card.Rank actual = test.getRank();
        Card.Rank expected = Card.Rank.FOUR;

        Assert.assertEquals(actual, expected);

    }

    @Test
    //literal numerical value of card
    public void getRankValue() {

        int actual = test.getRank().getIntegerCardVal();
        int expected = 4;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getSuite() {

        Card.Suite actual = test.getSuite();
        Card.Suite expected = Card.Suite.CLUBS;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testToString() {

        String actual = test.toString();
        String expected = "FOUR of CLUBS";

        Assert.assertEquals(actual, expected);
    }
}