package com.codedifferently.casino;

public class Card {

    final Suite suite;
    final Rank rank;

    public Card(Suite suite, Rank rank)
    {
        //enum are their own seperate classes that were created to become instance vars for the Card class
        this.suite = suite;
        this.rank = rank;
    }

    //enum data types have to be public in order to use them in your constuctors
    public enum Suite
    {
        //enums must be created as their own class, you can add primitives
        //to their value by this: enumVar(primitive variable)
        //to print an enum, call the class file, the enum class
        HEARTS,
        CLUBS,
        SPADES,
        DIAMONDS;
    }

    public enum Rank
    {
        //why must you declare the enums first? b/c they act like instance vars?

        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        //reset order of card deck
//        public Rank next()
//        {
//            if (this == Rank.KING)
//            {
//                return Rank.ACE;
//            }
//
//            return Rank.values()[ordinal()+1];
//        }

        private int integerCardVal;

        Rank(int integerCardVal)
        {
            this.integerCardVal = integerCardVal;
        }

        public int getIntegerCardVal()
        {
            return integerCardVal;
        }

        public int getCardRank()
        {
            return this.getIntegerCardVal();
        }

    }

    public Rank getRank()
    {
        return this.rank;
    }

    public int getRankValue()
    {
        return this.rank.getIntegerCardVal();
    }

    public Suite getSuite()
    {
        return this.suite;
    }

    @Override
    public String toString() {
        String card = this.getRank() + " of " + this.getSuite();
        return card;
    }

    public static void main(String[] args) {
        //Card test = new Card();
        //System.out.println(Rank.CLUBS + " card, bitch");
        //System.out.println(Value.FIVE.getIntegerCardVal());
        System.out.println();
        Card test = new Card(Suite.HEARTS,Rank.FOUR);
        System.out.println(test);
    }
}
