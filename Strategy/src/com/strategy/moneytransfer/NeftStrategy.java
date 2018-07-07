package com.strategy.moneytransfer;

/**
 * Created by Dheeraj Kumar Barnwal on 08/07/18.
 */
public class NeftStrategy implements MoneyTransferStrategy{
    String accountNumber;
    String ifsc;
    public NeftStrategy(String number, String code){
        this.accountNumber = number;
        this.ifsc = code;
    }
    public void transfer(int amount){
        System.out.println("Money transferred successfully through NEFT, below are details");
        System.out.println("Amount: " + amount + "\nRecipient AccountNumber: " + accountNumber + "\nIFSC: " + ifsc);
    }
}
