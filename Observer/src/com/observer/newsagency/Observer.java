package com.observer.newsagency;

/**
 * Created by Dheeraj Kumar Barnwal on 04/07/18.
 */
public interface Observer {
    //method to update the observer, used by subject
    public void update(String type);

    //attach with subject to observe
    public void setSubject(Subject sub);
}
