package com.strategy.moneytransfer;

/**
 * Created by Dheeraj Kumar Barnwal on 08/07/18.
 */
public class StrategyPatternTest {
    public static void main(String args[]){
        MoneyTransferContext context = new MoneyTransferContext();

        context.setStrategy(new UpiStrategy("dheeraj@sbi"));
        context.transfer(1000);

        context.setStrategy(new NeftStrategy("123456789", "SBIN01234"));
        context.transfer(1000);
    }
}
