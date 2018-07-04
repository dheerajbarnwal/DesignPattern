package com.observer.newsagency;

/**
 * Created by Dheeraj Kumar Barnwal on 04/07/18.
 */
public class FinancialNews implements Observer{
    private Subject subject;
    public void update(String type){
        if(type.equals("fin")){
            String news = subject.getUpdate();
            System.out.println("Got financial news : " + news );
        }

    }

    public void setSubject(Subject sub){
        this.subject = sub;
    }
}
