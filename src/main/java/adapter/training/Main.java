package adapter.training;

import adapter.training.api.*;

public class Main {

    public static void main(String[] args) {

        LibraryAPI api = new LibraryAPIImpl();
        User user = new User("Paweł","Cwik","32131212");
        BookConnector connector = new BookConnector(user,api);
        connector.checkAviability("Harry Potter i Zakon Feniksa");

        User user2 = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user2);
        BookConnector connector2 = new BookConnector(user2,apiAdapter);
        connector2.checkAviability("Harry Potter i Zakon Feniksa");

    }
}
