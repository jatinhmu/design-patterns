package org.example.strategypattern.service;

public interface PaymentStrategy {
    void processPayment(Double amount);
}
