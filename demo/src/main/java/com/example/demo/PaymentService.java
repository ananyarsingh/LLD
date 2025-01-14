package com.example.demo;

import java.util.HashMap;

public class PaymentService {
    //storing + making payments

    HashMap<String,PaymentMethod> paymentMethods;
    PaymentService(){
        paymentMethods = new HashMap<>();
    }
    //add payment method
    public void addPaymentMethod(String name, PaymentMethod pm) {
        //Ananya's credit card
        paymentMethods.put(name, pm);
    }

    public void makePayment(String paymentMethodName){
        PaymentMethod pm = paymentMethods.get(paymentMethodName);
        pm.pay();//run time polymorphism
    }

    public  void  makePayment(PaymentMethod paymentMethod){

    }



}
