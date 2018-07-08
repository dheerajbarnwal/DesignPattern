package com.adapter.filetransfer;

/**
 * Created by Dheeraj Kumar Barnwal on 08/07/18.
 */
public class CardReader implements MemoryCard{
    private Computer adaptee;
    public CardReader(Computer computer){
        this.adaptee = computer;
    }
    public void transfer(){
        adaptee.toTransfer();
    }
}
