package org.example.strategypattern.service;

import org.example.strategypattern.PaymentMode;

public interface PaymentService {
    void processPayment(PaymentMode paymentMode, Double amount);
}
