package com.company;

import java.util.LinkedList;

/**
 * Created by hp on 25-02-2016.
 */
public class MyQueue <Whatever> {
    private LinkedList <Whatever> list = new LinkedList<>();

    public void add (Whatever item){
        list.addLast(item);


    }

    public Whatever remove(){
        return list.removeFirst();

    }
}
