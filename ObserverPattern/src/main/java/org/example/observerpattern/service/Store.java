package org.example.observerpattern.service;

import org.example.observerpattern.service.observable.IPhoneStockObservableImpl;
import org.example.observerpattern.service.observable.StockObservable;
import org.example.observerpattern.service.observer.EmailNotificationAlertObserverImpl;
import org.example.observerpattern.service.observer.NotificationAlertObserver;
import org.example.observerpattern.service.observer.SMSNotificationAlertObserverImpl;

public class Store {
    public static void main(String[] args) {
        StockObservable iPhoneStockObservable = new IPhoneStockObservableImpl();

        NotificationAlertObserver observer1 =new EmailNotificationAlertObserverImpl("abc@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 =new EmailNotificationAlertObserverImpl("jatin@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer3 =new SMSNotificationAlertObserverImpl("7337471537", iPhoneStockObservable);

        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);

        iPhoneStockObservable.setStockCount(10);
        System.out.println("done");

    }
}
