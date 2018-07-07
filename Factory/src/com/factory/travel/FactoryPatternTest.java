package com.factory.travel;

import java.util.Scanner;

/**
 * Created by Dheeraj Kumar Barnwal on 05/07/18.
 */
public class FactoryPatternTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill your personal details");
        System.out.println("Name :");
        String name = sc.next();
        System.out.println("Origin :");
        String origin = sc.next();
        System.out.println("Destination :");
        String destination = sc.next();

        System.out.println("Ticket Type(train/bus) : ");
        String ticketType = sc.next();

        TicketInfo info = new TicketInfo(name, origin , destination);

        Ticket ticket = TicketFactory.getTicket(ticketType);

        if(ticket == null){
            System.out.println("Invalid ticket type");
            System.exit(0);
        }
        info = ticket.createTicket(info);

        System.out.println("Hi "+ info.name.toUpperCase() + ", Here is your ticket");

        System.out.println("Origin: " + info.origin + "\nDestination: " + info.destination + "\nPrice: " + info.cost);

    }
}
