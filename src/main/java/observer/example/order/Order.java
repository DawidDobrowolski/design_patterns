package observer.example.order;

import observer.example.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> observers;

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.observers = new HashSet<>();
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(o -> o.update(this));
    }

    public void changeStatus(OrderStatus status){
        setOrderStatus(status);
        notifyObserver();
    }
}
