package com.PayMeNow;

public class BankTransferPaymentService implements PaymentService{


    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processes bt Bank Transfer : $" + amount);
    }
}
