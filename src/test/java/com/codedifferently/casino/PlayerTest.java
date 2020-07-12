package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {
    Player player= new Player("Mark");
    Player player2= new Player("Matt",100);
    Deck deck=new Deck();
@Test public void constructorTest(){
    assertEquals("Mark", player.getName());
    assertEquals("Matt", player2.getName());
    assertEquals(100, player2.getMoney(),0);
}
    @Test public void moneyTest(){
        assertEquals(100, player2.getMoney(),0);
        player2.setMoney(500);
        assertNotEquals(100, player2.getMoney(),0);
    }
    @Test public void handTest(){
        assertEquals(0, player2.getHand().size());
        player2.dealHandG(deck);
        assertEquals(7, player2.getHand().size());
    }
    @Test
    public void getCards() {
        Card test1 = new Card(Card.Suite.HEARTS, Card.Rank.ACE);
        Card test2 = new Card(Card.Suite.HEARTS, Card.Rank.TWO);
        Card test3 = new Card(Card.Suite.HEARTS, Card.Rank.THREE);

        player.getHand().add(test1);
        player.getHand().add(test2);
        player.getHand().add(test3);
        String actual = this.player.getHand() + "";
        String expected = "[ACE of HEARTS, TWO of HEARTS, THREE of HEARTS]";
        Assert.assertEquals(expected, actual);
    }
}

