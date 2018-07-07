package com.abstractfactory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 07/07/18.
 */
public class FoodFactory extends AbstractFactory{
    public Food getFood(String type){

        if(type.equalsIgnoreCase("veg")){
            return new VegFood();
        } else if(type.equalsIgnoreCase("nonveg")){
            return new NonVegFood();
        }
        return null;
    }

    public Ticket getTicket(String ticket){
        return null;
    }
}
