package com.codedifferently.casino;

import java.util.ArrayList;

public class Player {
    private String name;
    protected static ArrayList<Card> hand;
    private double money;
    private double bet;


    Player(String name, double money){
        this.name = name;
        this.money = money;
        hand=new ArrayList<>(7);
    }

    Player(String name){
        this.name = name;
        hand=new ArrayList<>(5);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }


    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public void dealHandG(Deck deck) {
        for (int i = 1; i <= 7; i++) {
                hand.add(deck.dealTopCard());
        }
    }
//    public void dealHandB( Deck deck) {
//        for (int i = 1; i <= 21; i++) {
//                hand.add(deck.deal());
//       }
//    }
}

