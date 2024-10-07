package org.example.strategypattern.service;

import org.example.strategypattern.PaymentMode;

public interface CheckoutService {

    boolean checkout(String order, PaymentMode paymentMode, Double amount);
}
