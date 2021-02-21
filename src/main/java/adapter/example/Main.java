package adapter.example;

import adapter.example.adapter.*;

public class Main {

    public static void main(String[] args) {


        ContinentalDevice radio = new ContinentalDevice() {
            public void on() {
                System.out.println("Gra muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("Gra angielska muzyka");
            }
        };

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(radio,ukRadio);
        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);

    }
}
