package org.example.observerpattern.service.observable;


import org.example.observerpattern.service.observer.NotificationAlertObserver;

public interface StockObservable {

    void removeObserver(NotificationAlertObserver notificationAlertObserver);

    void add(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    Object getData();
}
