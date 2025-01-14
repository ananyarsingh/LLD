package com.example.demo;

public class CreditCard extends Card{

    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);//invokes the constructor
    }

    @Override
     public void pay() {
        System.out.println("Making Payment via CreditCard");
    }
}
