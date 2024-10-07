package org.example.strategypattern.service.impl;

import lombok.AllArgsConstructor;
import org.example.strategypattern.PaymentMode;
import org.example.strategypattern.service.PaymentService;
import org.example.strategypattern.service.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class PaymentServiceV2Impl implements PaymentService {
    Map<String, PaymentStrategy> paymentStrategyMap;
    @Override
    public void processPayment(PaymentMode paymentMode, Double amount) {
        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentMode.name());
        paymentStrategy.processPayment(amount);
    }
}
