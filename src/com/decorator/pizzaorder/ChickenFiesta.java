package com.decorator.pizzaorder;

/**
 * Created by Dheeraj Kumar Barnwal on 02/07/18.
 */
public class ChickenFiesta implements Pizza{
    public int getCost(){
        return 150;
    }
    public void pizzaType(){
        System.out.println("its chicken fiesta");
    }
}
