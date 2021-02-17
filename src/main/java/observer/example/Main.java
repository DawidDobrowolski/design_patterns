package observer.example;

import observer.example.notification.Email;
import observer.example.notification.MobileApp;
import observer.example.notification.TextMessage;
import observer.example.order.Order;
import observer.example.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.addObserver(email);
        order.addObserver(mobileApp);
        order.addObserver(textMessage);

        order.changeStatus(OrderStatus.WYSLANE);

        System.out.println("================================================");

        order.removeObserver(email);
        order.changeStatus(OrderStatus.ODEBRANE);
    }
}
