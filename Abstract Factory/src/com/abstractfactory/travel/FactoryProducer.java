package com.abstractfactory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 07/07/18.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("ticket")){
            return new TicketFactory();
        }else if(choice.equalsIgnoreCase("food")){
            return new FoodFactory();
        }
        return null;
    }
}
