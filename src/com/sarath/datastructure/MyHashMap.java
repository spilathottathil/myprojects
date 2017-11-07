package com.sarath.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spilathottathil on 11/6/17.
 */
public class MyHashMap<K, V>  {

    private ArrayList<Entry<K,V>> table;
    private int initialCapacity;

    public static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;


        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }

    public MyHashMap(){
        table = new ArrayList<>(initialCapacity);
    }



    public void put(K newKey, V newValue){
        //first get the hash
        int hashValue = Math.abs(newKey.hashCode() % initialCapacity);
        Entry<K,V> newNode = new Entry<>(newKey,newValue,null);

        if(table.get(hashValue) == null){
            table.add(newNode);
        }else {
            //Now we need to go through the lInked list. Basically this is a sorted linked list insertion.
            Entry<K,V> currentNode = table.get(hashValue);
            Entry<K,V> prev = null;
            while(currentNode != null){
                //compare the key values and insert the modes accordingly. if equal replace the value

                if( currentNode.key.equals(newKey)){
                    //replace

                }
                //if less
                //check if prev is null.
                if(prev == null){
                    //insert as head.
                }else{
                    //insert before.

                }
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }

    }
}
