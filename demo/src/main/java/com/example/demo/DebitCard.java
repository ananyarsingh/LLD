package com.example.demo;

public class DebitCard extends Card {
    public DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via debit card : " + cardNo);
    }
}
