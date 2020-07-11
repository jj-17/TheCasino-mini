package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;//holds all the cards in the deck
    //ArrayList<Card> usedCards = new ArrayList<>();


    Deck() {
        cards=new ArrayList<>();
        //constructs the deck with 13 cards of each suite
        for (Card.Suite suite : Card.Suite.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suite, rank));
            }
        }


    }
    //makeshift length method for the deck
    public int numCards() {
        return cards.size();
    }
    //deals one card(probably useful for BackJack class)
    public Card dealTopCard() {
        Card topCard = cards.get(0);
        cards.remove(topCard);
        return topCard;
    }
    //deals multiple cards at a time
    public Deck deal(int numCards) {
        for (int i = 0; i<numCards; i++) {
            Card topCard = cards.get(i);
            cards.remove(topCard);
        }

        return this;
    }
    //Shuffles cards in arraylist
    public void shuffle() {
        Collections.shuffle(cards);
    }
    //Used for debugging
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Card card : cards) {
            output.append(card.toString()).append("\n");
        }
        return output.toString();
    }

//    public static void main(String[] args) {
//        Deck test = new Deck();
//        System.out.println(test.toString());
//    }
}

