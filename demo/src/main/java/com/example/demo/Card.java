package com.example.demo;

public abstract class Card implements PaymentMethod{
    //private properties you can't use them so you use getter methods
    protected   String cardNo;
    protected   String userName;
    public Card(String cardNo, String userName) {
        this.cardNo = cardNo;
        this.userName = userName;
    }
    public String getCardNo() {
        return cardNo;
    }
    public String getUserName() {
        return userName;
    }
   // abstract void pay(); moved to interface
}
