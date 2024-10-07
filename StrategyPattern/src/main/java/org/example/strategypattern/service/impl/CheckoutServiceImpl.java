package org.example.strategypattern.service.impl;

import lombok.AllArgsConstructor;
import org.example.strategypattern.PaymentMode;
import org.example.strategypattern.service.CheckoutService;
import org.example.strategypattern.service.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Qualifier("paymentServiceImpl")
    private PaymentService paymentService;
    @Override
    public boolean checkout(String order, PaymentMode paymentMode, Double amount) {
        paymentService.processPayment(paymentMode, amount);

        return true;
    }
}
