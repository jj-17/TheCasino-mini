package com.codedifferently.casino;

public interface Game {
    public void startGame();
    //end game method
}

public class BlackJack extends CardGame {
    public void startGame() {
        this.dealCards();
        this.startTurn();
    }

    public class goFish implements Game
    {
        public void startGame()
        {

        }
    }

    public class blackJack implements Game {


        public void startGame()
        {
        }
    }

    public class MyApp {
        public void selectGame(String selection) {
            BlackJack blackjack = new BlackJack();
            goFish hilo = new goFish();
            this.startGame(blackJack);
            this.startGame(goFish);
        }

        public void startGame(Game selectedGame) {
            selectedGame.startGame();

        }
    }
}
