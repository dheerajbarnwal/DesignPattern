package com.abstractfactory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 07/07/18.
 */
public class TicketInfo {
    public String name;
    public String origin;
    public String destination;
    public int cost;

    public TicketInfo(String n,String o, String d){
        name = n;
        origin = o;
        destination = d;
        cost = 0;
    }
}
