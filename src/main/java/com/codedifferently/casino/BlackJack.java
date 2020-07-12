package com.codedifferently.casino;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BlackJack extends CardGame {

    private Player player;
    private Deck card_Deck;
    private double gameBet;
    private boolean win;

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

        double playersCurrentMoney = this.getPlayer().getMoney();
        boolean validBet = false;
        System.out.println("Please enter your initial bet: ");
        double attemptedBet = sc.nextDouble();

        while (!validBet) {

            if (attemptedBet <= playersCurrentMoney)
            {

                this.setPlayerMoney(attemptedBet);
                System.out.println("You have made a bet of $"+attemptedBet);
                System.out.println("Your new balance is "+ this.getPlayer().getMoney());
                validBet = true;
            }
            else {
                System.out.println("You do not have enough money to bet $"+attemptedBet);
                System.out.println("Please enter a bet");
            }
        }

    }

    public void startGame()
    {





    }

    public void endGame()
    {

    }
}
