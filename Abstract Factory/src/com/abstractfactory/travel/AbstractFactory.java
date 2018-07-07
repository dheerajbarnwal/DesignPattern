package com.abstractfactory.travel;

/**
 * Created by Dheeraj Kumar Barnwal on 07/07/18.
 */
public abstract class AbstractFactory {
    abstract Food getFood(String type);
    abstract Ticket getTicket(String type);
}
