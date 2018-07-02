package com.decorator.pizzaorder;

/**
 * Created by Dheeraj Kumar Barnwal on 02/07/18.
 */
public class CheeseBurst extends PizzaDecorator{
    public CheeseBurst(Pizza p){
        super(p);
    }
    public int getCost(){
        return super.getCost()+20;
    }
    public void pizzaType(){
        super.pizzaType();
        System.out.println("Cheese burst added");
    }
}