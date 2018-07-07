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

        TicketInfo tinfo = TicketFactory.getTicket(ticketType, name, origin , destination);

        System.out.println("Here is your ticket");

        System.out.println("Name : " + tinfo.name + "\nOrigin: " + tinfo.origin + "\nDestination: " + tinfo.destination
                            + "\nCost: " + tinfo.cost);

    }
}
