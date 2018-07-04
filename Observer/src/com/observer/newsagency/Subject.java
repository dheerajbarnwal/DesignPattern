package com.observer.newsagency;

/**
 * Created by Dheeraj Kumar Barnwal on 04/07/18.
 */
public interface Subject {
    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public String getUpdate();
}
