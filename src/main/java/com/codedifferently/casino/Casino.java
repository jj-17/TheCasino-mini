package com.codedifferently.casino;


import javax.swing.*;
import java.util.Scanner;

/**
 * This class acts as the Driver to run the casino simulation.
 * 07/10/20 Update:
 * Still need to integrate with class
 */
public class Casino {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String player, money, bet;//user inputs for games
        player= JOptionPane.showInputDialog("Enter player name:");
        money = JOptionPane.showInputDialog("Enter money:");
        bet = JOptionPane.showInputDialog("Enter bet:");
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Would you like to play a game?",
                "Choose",
                JOptionPane.YES_NO_OPTION);//Shows options
        if (selectedOption == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,"See you next time");//exits simulation
            System.exit(1);
        }else{
            Object[] options = { "BlackJack", "Go Fish"};//buttons
            int selectedGame = JOptionPane.showOptionDialog(null,//parent container
                    "Which game would you like to play?",
                    "Choose Game",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,//the titles of buttons
                    options[1]);//Shows game options
            CardGame game = null;
            if (selectedGame == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,"Let's play Go Fish!");
               game.selectGame('g');//starts goFish game
                //System.out.println("g");
            }else if(money.equals("0")
                    ||Integer.parseInt(money)<Integer.parseInt(bet)){
                JOptionPane.showMessageDialog(null,"Sorry you don't have enough to play BlackJack");
                main(args);//restarts process if not enough money
            }else {
                JOptionPane.showMessageDialog(null,"Let's play Black Jack!");
                game.selectGame('b');//starts blackJack game
                //System.out.println("b");
            }
        }

    }
}


