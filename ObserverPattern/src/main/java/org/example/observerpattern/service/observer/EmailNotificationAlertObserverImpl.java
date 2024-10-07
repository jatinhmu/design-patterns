package org.example.observerpattern.service.observer;

import org.example.observerpattern.service.observable.StockObservable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotificationAlertObserverImpl implements NotificationAlertObserver {
    private static final Logger log = LoggerFactory.getLogger(EmailNotificationAlertObserverImpl.class);
    private final String email;
    private final StockObservable stockObservable;
    public EmailNotificationAlertObserverImpl(String email, StockObservable stockObservable){
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendEmail(email, stockObservable.getData());
    }

    private void sendEmail(String email, Object data) {
        System.out.println("Email sent : " + email);
    }
}
