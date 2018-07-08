package com.adapter.filetransfer;

/**
 * Created by Dheeraj Kumar Barnwal on 08/07/18.
 */
public class AdapterPatternTest {
    public static void main(String args[]){
        MemoryCard card =  new CardReader(new Computer());
        card.transfer();
    }
}
