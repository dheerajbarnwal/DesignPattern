package com.decorator.pizzaorder;

/**
 * Created by Dheeraj Kumar Barnwal on 02/07/18.
 */
public class PizzaDecorator implements Pizza {
    public Pizza pizza;
    public PizzaDecorator(Pizza p){
        this.pizza =p;
    }
    public int getCost(){
        return this.pizza.getCost();
    }
    public void pizzaType(){
        this.pizza.pizzaType();
    }
}
