package com.singleton;

/**
 * Created by Dheeraj Kumar Barnwal on 03/07/18.
 */

/**
 * Bill Pugh Singleton Implementation
 * most widely used approach as it doesn’t use synchronization
 */
public class BillPugh {
    private BillPugh(){}

    private static class SingletonHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
