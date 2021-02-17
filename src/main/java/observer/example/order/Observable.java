package observer.example.order;

import observer.example.notification.Observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
