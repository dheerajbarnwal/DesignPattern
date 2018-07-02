package com.decorator.pizzaorder;

/**
 * Created by Dheeraj Kumar Barnwal on 02/07/18.
 */
public class Capsicum extends PizzaDecorator{
        public Capsicum(Pizza p){
            super(p);
        }
    public int getCost(){
        return super.getCost()+30;
    }
    public void pizzaType(){
        super.pizzaType();
        System.out.println("Capsicum added");
    }
}
