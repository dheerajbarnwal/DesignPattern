package com.singleton;

/**
 * Created by Dheeraj Kumar Barnwal on 03/07/18.
 * Thread Safe Singleton
 */
public class ThreadSafe {
    private static ThreadSafe instance;
    private ThreadSafe(){}
    public static synchronized ThreadSafe getInstance(){
        if(instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }
}
