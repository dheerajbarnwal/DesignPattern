package com.singleton;

/**
 * Created by Dheeraj Kumar Barnwal on 03/07/18.
 * Lazy initialization with Double check locking
 */
public class ThreadSafeDoubleLock {
    private static ThreadSafeDoubleLock instance;
    private ThreadSafeDoubleLock(){}

    public static ThreadSafeDoubleLock getInstance(){
        if(instance == null){
            synchronized(ThreadSafeDoubleLock.class){
                if(instance == null){
                    instance = new ThreadSafeDoubleLock();
                }
            }
        }
        return instance;
    }
}
