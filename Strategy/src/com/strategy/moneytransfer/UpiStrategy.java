package com.strategy.moneytransfer;

/**
 * Created by Dheeraj Kumar Barnwal on 08/07/18.
 */
public class UpiStrategy implements MoneyTransferStrategy{
    String upiId;
    public UpiStrategy(String id){
        this.upiId = id;
    }
    public void transfer(int amount){
        System.out.println("Money transferred successfully through UPI, below are details");
        System.out.println("Amount: " + amount + "\nRecipient UPI ID: " + upiId);
    }
}
