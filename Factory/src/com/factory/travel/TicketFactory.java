package com.factory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 05/07/18.
 */
public class TicketFactory {
    private static Ticket ticket;
    public TicketFactory(Ticket ticket){
        this.ticket = ticket;
    }

    public static TicketInfo getTicket(String type, String name, String origin, String destination){
        TicketInfo info = new TicketInfo(name, origin, destination);
        if(type.equalsIgnoreCase("bus")){
            new TicketFactory(new BusTicket());
        } else if(type.equalsIgnoreCase("train")){
            new TicketFactory(new TrainTicket());
        }
        return ticket.createTicket(info);
    }
}
