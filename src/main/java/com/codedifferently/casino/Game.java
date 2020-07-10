package com.codedifferently.casino;

public interface Game {
    void startGame();
}

public class BlackJack extends CardGame implements Game {
    public void startGame() {
        this.dealCards();
        this.startTurn();
    }
}
    public class goFish implements Game {
        public void startGame() {
        }
    }

    public class blackJack implements Game {
        public void startGame(){
        }
    }

    public class MyApp {
        public void selectGame(String selection) {
            BlackJack blackjack = new BlackJack();
            goFish goFish = new goFish();
            this.startGame(blackJack);
            this.startGame(goFish);
        }

        public void startGame(Game selectedGame) {
            selectedGame.startGame();

        }
    }
}
