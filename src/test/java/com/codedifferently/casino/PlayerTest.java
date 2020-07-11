package com.codedifferently.casino;

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
}

