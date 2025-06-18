package com.PayMeNow;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processes by Paypal : $" + amount);


    }
}
