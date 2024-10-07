package org.example.strategypattern.service.impl;

import org.example.strategypattern.PaymentMode;
import org.example.strategypattern.service.CCPayment;
import org.example.strategypattern.service.PaymentStrategy;
import org.example.strategypattern.service.UPIPayment;
import org.springframework.stereotype.Service;

@Service
public class PaymentStrategyFactory {

    PaymentStrategy getPaymentStrategy(PaymentMode paymentMode){
        return switch (paymentMode) {
            case UPI -> new UPIPayment();
            case CC -> new CCPayment();
            default -> null;
        };
    }
}
