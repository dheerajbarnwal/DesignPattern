package com.abstractfactory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 05/07/18.
 */
public class BusTicket implements Ticket{

    public TicketInfo createTicket(TicketInfo info){
        info.cost = 1500;
        return info;
    }
}
