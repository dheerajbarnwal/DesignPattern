package com.singleton;

/**
 * Created by Dheeraj Kumar Barnwal on 03/07/18.
 * Lazy initialization
 */

public class LazyInitialized {
    private static LazyInitialized instance;
    private LazyInitialized(){}

    public static LazyInitialized getInstance(){
        if(instance == null){
            instance = new LazyInitialized();
        }
        return instance;
    }
}
