package org.example.strategypattern.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("UPI")
public class UPIPayment implements PaymentStrategy {
    @Override
    public void processPayment(Double amount) {

    }
}
