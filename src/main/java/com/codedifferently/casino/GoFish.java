package com.codedifferently.casino;

import java.util.ArrayList;

import static com.codedifferently.casino.Player.*;

public class GoFish extends CardGame{
    Player player;
    Deck goFishDeck;
    private boolean win=false;
    public void play() {
        player = new Player("Jimmy");
        goFishDeck = new Deck();
        goFishDeck.shuffle();
        player.dealHandG(goFishDeck);
    }
    public boolean goFish(){
        int count = 0;
        for(int i=0;i<hand.size(); i++){
            if (hand.get(i).equals(hand.get(i+1))) {
                count++;
            }
        }
            if (count >= 4) {
                win=true;
                return true;
            }
        return false;
    }
    public boolean isWin() {
        return win;
    }
}
