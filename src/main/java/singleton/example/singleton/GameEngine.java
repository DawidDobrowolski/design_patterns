package singleton.example.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance;

    public void run() {
        while(true) {
            //czekamy na input gracza
            //zmienamy stan gry
            //renderujemy grafike
        }
    }

    private GameEngine() {

    }

    public static GameEngine getInstance(){
        if(instance == null){
            synchronized (GameEngine.class){
                if(instance == null){
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }


}
