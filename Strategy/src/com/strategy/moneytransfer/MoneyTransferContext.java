package com.strategy.moneytransfer;

/**
 * Created by Dheeraj Kumar Barnwal on 08/07/18.
 */
public class MoneyTransferContext {
    private MoneyTransferStrategy strategy;
    public  void setStrategy(MoneyTransferStrategy strategy){
        this.strategy = strategy;
    }

    public void transfer(int amount){
        strategy.transfer(amount);
    }
}
