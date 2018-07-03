package com.singleton;

/**
 * Created by Dheeraj Kumar Barnwal on 03/07/18.
 */

/**
 * Eager initialization
 */

public class EagerInitialized {
    private static EagerInitialized instance = new EagerInitialized();

    //private constructor to avoid client applications to use constructor
    private EagerInitialized(){}

    public static EagerInitialized getInstance(){
        return instance;
    }
}
