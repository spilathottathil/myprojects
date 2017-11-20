package com.sarath.datastructure;

import java.util.HashMap;

/**
 * Created by spilathottathil on 11/7/17.
 */
public class MyCache {

    private HashMap<String,Node> map;
    private Node head;
    private Node tail;
    private int size =0;
    private static final int MAX_SIZE = 20;

    public MyCache(){
        map = new HashMap<String,Node>();
    }

    public  void insertUpdateToCache(){
        //
        if(map.get(" ") != null){
            //update
            //bring to front.
        }else{
            //Node newNode = new Node(data);
            //insert to the map.
            size++;
        }
    }

    public void evict(){
        if(size > MAX_SIZE){
            //remove the tail.
        }
    }
}
