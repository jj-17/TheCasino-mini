package com.codedifferently.casino;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private double money;
    private double bet;


    Player(String name, double money){
        this.name = name;
        this.money = money;
        hand=new ArrayList<Card>(7);
    }

    Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }

    private void bet(double bet){
        this.bet = bet;
    }

    public double getMoney() {
        return money;
    }
}

