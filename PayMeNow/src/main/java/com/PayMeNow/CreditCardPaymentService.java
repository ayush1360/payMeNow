package com.PayMeNow;

public class CreditCardPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processes by Credit Card : $" + amount);

    }
}
