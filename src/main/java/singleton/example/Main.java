package singleton.example;

import singleton.example.singleton.GameEngine;
import singleton.example.singleton.GameEngineEnum;

public class Main {

    public static void main(String[] args) {
        GameEngine engine1 = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine1==engine2);


        GameEngineEnum engineEnum1 = GameEngineEnum.INSTANCE;
        GameEngineEnum engineEnum2 = GameEngineEnum.INSTANCE;

        engineEnum1.setCharacterName("test");
        System.out.println(engineEnum2.getCharacterName());
    }
}
