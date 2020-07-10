package com.codedifferently.casino;


import javax.swing.*;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = sc.next();
        //inputStr = JOptionPane.showInputDialog("Would you like to play a game");
        while(!(response.equalsIgnoreCase("yes"))) {
        }

        if(response.equalsIgnoreCase("yes")){
            Game game = new Game();
            //game.chooseGameType();
        }else if(!response.equalsIgnoreCase("yes")){
            System.out.println("See you next time");
        }

    }
}


