package com.observer.newsagency;

import java.util.*;

/**
 * Created by Dheeraj Kumar Barnwal on 04/07/18.
 */
public class News implements Subject{
    List<Observer> observers;
    String news;
    String newsType;
    public News(){
        observers = new ArrayList<>();
    }
    public void register(Observer obj){
        observers.add(obj);
    }

    public void unregister(Observer obj){
        observers.remove(obj);
    }

    public void notifyObservers(){
        for(Observer ob : observers){
            ob.update(newsType);
        }
    }

    public void postNews(String type, String news){
        this.news = news;
        this.newsType = type;
        notifyObservers();
    }

    public String getUpdate(){
        return this.news;
    }
}
