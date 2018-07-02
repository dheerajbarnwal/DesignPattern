package com.decorator.pizzaorder;

/**
 * Created by Dheeraj Kumar Barnwal on 02/07/18.
 */
public class DecPatTest {
    public static void main(String[] args) {

        Pizza cfcc = new CheeseBurst(new Capsicum(new ChickenFiesta()));
        cfcc.pizzaType();
        int cost = cfcc.getCost();
        System.out.println("Your customized pizza cost is " + cost);
    }
}
