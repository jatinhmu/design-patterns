package org.example.observerpattern.service.observable;

import org.example.observerpattern.service.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservableImpl implements StockObservable {

    private final List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        notificationAlertObservers.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(this.stockCount==0){
            stockCount += newStockAdded;
            notifySubscribers();
        }
    }

    @Override
    public Object getData() {
        return stockCount;
    }
}
