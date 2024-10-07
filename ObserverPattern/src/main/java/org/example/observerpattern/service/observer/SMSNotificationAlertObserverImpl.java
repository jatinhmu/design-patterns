package org.example.observerpattern.service.observer;

import org.example.observerpattern.service.observable.StockObservable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSNotificationAlertObserverImpl implements NotificationAlertObserver {
    private static final Logger log = LoggerFactory.getLogger(SMSNotificationAlertObserverImpl.class);
    String phoneNo;
    StockObservable stockObservable;
    public SMSNotificationAlertObserverImpl(String phoneNo, StockObservable stockObservable) {
        this.phoneNo = phoneNo;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
       sendSMS(phoneNo, stockObservable.getData());
    }

    private void sendSMS(String phoneNo, Object data) {
        System.out.println("SMS sent to " + phoneNo);
    }
}
