package com.codedifferently.casino;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BlackJack extends CardGame {

    private Player player;
    private Deck card_Deck;
    private double gameBet;
    private boolean win;
    public static double attemptedBet;

    public BlackJack(Player player)
    {
        this.player = player;
        this.card_Deck = new Deck();
        this.gameBet = 0;
        this.win = false;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayerMoney(double money) {
        double playersCurrentMoney = this.getPlayer().getMoney();

        this.getPlayer().setMoney(playersCurrentMoney - money);
    }


    public boolean checkBet() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            double playersCurrentMoney = this.getPlayer().getMoney();
            //boolean validBet = false;
            System.out.println("Please enter your initial bet: ");


            try {
                //this variable is static so that it can be used for eceptions throughout the program/while loops
                attemptedBet = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("\nYou did not provide a number\n");
                checkBet();
                break;

            }


            System.out.println(this.getPlayer().getMoney());
            if (attemptedBet <= playersCurrentMoney && playersCurrentMoney != 0) {
                this.setPlayerMoney(attemptedBet);
                System.out.println("You have made a bet of $" + attemptedBet);
                System.out.println("Your new balance is " + this.getPlayer().getMoney());
                break;
            } else {
                System.out.println("You do not have enough money to bet $" + attemptedBet);
                attemptedBet = sc.nextDouble();
            }
            //you have finished/given a valid amt of money to start the game

        }
        return true;
    }

    public void startGame()
    {



    }

    public void endGame()
    {

    }

    public static void main(String[] args) {
        Player test = new Player("john", 100);
        BlackJack game = new BlackJack(test);
        System.out.println(game.checkBet());
    }
}
