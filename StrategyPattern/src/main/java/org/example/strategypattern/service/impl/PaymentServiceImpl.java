package org.example.strategypattern.service.impl;

import lombok.AllArgsConstructor;
import org.example.strategypattern.PaymentMode;
import org.example.strategypattern.service.PaymentService;
import org.example.strategypattern.service.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    PaymentStrategyFactory paymentStrategyFactory;
    @Override
    public void processPayment(PaymentMode paymentMode, Double amount) {
        PaymentStrategy paymentStrategy = paymentStrategyFactory.getPaymentStrategy(paymentMode);
        paymentStrategy.processPayment(amount);
    }
}
