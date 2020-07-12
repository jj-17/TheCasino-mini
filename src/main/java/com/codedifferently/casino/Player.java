package com.codedifferently.casino;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private ArrayList<Card> secondHand;
    private double money;

    public void setName(String name) {
        this.name = name;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    private double bet;

    public ArrayList<Card> getSecondHand() {
        return secondHand;
    }

    public void setSecondHand(ArrayList<Card> secondHand) {
        this.secondHand = secondHand;
    }

    Player(String name, double money){
        this.name = name;
        this.money = money;
        hand=new ArrayList<>(7);
        this.secondHand = new ArrayList<>();
    }

    Player(String name){
        this.name = name;
        hand=new ArrayList<>(5);
        this.secondHand = new ArrayList<>();
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

