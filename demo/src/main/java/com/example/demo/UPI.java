package com.example.demo;

public class UPI implements PaymentMethod{
    String upiID;
    UPI(String upiID){
        this.upiID = upiID;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment through UPI ID: " + upiID);
    }
}
