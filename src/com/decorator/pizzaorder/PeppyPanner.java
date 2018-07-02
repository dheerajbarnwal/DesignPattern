package com.decorator.pizzaorder;

/**
 * Created by Dheeraj Kumar Barnwal on 02/07/18.
 */
public class PeppyPanner implements Pizza {
    public int getCost(){
        return 120;
    }
    public void pizzaType(){
        System.out.println("its Peppy paneer");
    }
}
