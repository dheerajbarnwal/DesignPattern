package com.abstractfactory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 05/07/18.
 */
public class TicketFactory extends AbstractFactory{

    public Ticket getTicket(String type){

        if(type.equalsIgnoreCase("bus")){
            return new BusTicket();
        } else if(type.equalsIgnoreCase("train")){
            return new TrainTicket();
        }
        return null;
    }

    public Food getFood(String food){
        return null;
    }
}
