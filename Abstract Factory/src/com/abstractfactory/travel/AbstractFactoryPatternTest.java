package com.abstractfactory.travel;

import java.util.Scanner;

/**
 * Created by Dheeraj Kumar Barnwal on 05/07/18.
 */
public class AbstractFactoryPatternTest {
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

        System.out.println("Food Type(Veg/NonVeg) : ");
        String foodType = sc.next();



        TicketInfo info = new TicketInfo(name, origin , destination);

        AbstractFactory ticketFactory = FactoryProducer.getFactory("ticket");
        AbstractFactory foodFactory = FactoryProducer.getFactory("food");

        Ticket ticket = ticketFactory.getTicket(ticketType);
        Food food = foodFactory.getFood(foodType);

        if(ticket == null || food == null){
            System.out.println("Invalid ticket/food type");
            System.exit(0);
        }
        info = ticket.createTicket(info);

        int price = food.getPrice();

        System.out.println("Hi "+ info.name.toUpperCase() + ", Here is your Booking detail");

        System.out.println("Origin: " + info.origin + "\nDestination: " + info.destination
                + "\nTicket Price: " + info.cost + "\nFood(" + foodType + ") Price: " + price);

        System.out.println("Total price: " + (info.cost + price));

    }
}
