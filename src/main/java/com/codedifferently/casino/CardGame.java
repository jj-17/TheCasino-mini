package com.codedifferently.casino;

public class CardGame implements Game{
    Game game;
    //@Override
    public void startGame() {

    }


    //extends game interface (the start method)

    //switch cases to choice game what to play

    public void selectGame(char selection) {
        switch(selection){
            case 'b':
            game= new BlackJack();
            //default;
            case 'g':
            game= new GoFish();
            //default;
    }
    this.startGame(game);
    }

    public void startGame(Game selectedGame) {
        selectedGame.startGame();

    }
}
