package singleton.training.singleton;

import java.util.Random;

public class GuessGame {

    int score;
    private static GuessGame instance;

    public static GuessGame getInstance() {
        if (instance == null) {
            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

    public void play() {
        Random ran = new Random();
        score = ran.nextInt(10);
    }

    public int getScore() {
        return score;
    }


}
