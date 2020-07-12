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
        boolean completedBet = false;

        while (!completedBet)
        {
            if (money <= this.getPlayer().getMoney()) {
                this.getPlayer().setMoney(playersCurrentMoney - money);
                completedBet = true;
            } else {
                System.out.println("Your attempted bet exceeds your money.");
            }
        }
    }

    public void startGame()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your initial bet: ");
        double playersBet = sc.nextDouble();
        //this.setPlayerMoney();

    }

    public void endGame()
    {

    }
}
