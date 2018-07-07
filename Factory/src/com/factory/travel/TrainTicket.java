package com.factory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 05/07/18.
 */
public class TrainTicket implements Ticket{

    public TicketInfo createTicket(TicketInfo info){
        info.cost = 1000;
        return info;
    }
}
