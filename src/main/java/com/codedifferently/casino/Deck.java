package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList();//holds all the cards in the deck
    //constructs the deck with 13 cards of each suite
    Deck() {
        for (Card.Suite suite : Card.Suite.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suite, rank));
            }
        }
    }

    public Card deal() {
        Card first = cards.get(0);
        cards.remove(first);
        return first;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}

