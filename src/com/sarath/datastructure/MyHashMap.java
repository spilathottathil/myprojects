package com.sarath.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by spilathottathil on 11/6/17.
 */
public class MyHashMap<K, V>  {

    private ArrayList<Entry<K,V>> table;
    private int initialCapacity = 16;

    public static class Entry<K, V> {
        int hash;
        K key;
        V value;
        Entry<K, V> next;


        public Entry(int hash,K key, V value, Entry<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }



    public MyHashMap(){
        table = new ArrayList<>(initialCapacity);
    }

    public V get(K key){
        int index = key.hashCode() & initialCapacity -1 ;
        Entry<K,V> entry = table.get(index);

        if(entry.key.equals(key) && entry.hash == key.hashCode()){
            return entry.value;
        }else{

        }
        return null;
    }

    public void put(K newKey, V newValue){
        //first get the hash
        //int hashValue = Math.abs(newKey.hashCode() % initialCapacity);
        int index = newKey.hashCode() & initialCapacity -1 ;
        Entry<K,V> newNode = new Entry<>(newKey.hashCode(),newKey,newValue,null);

        if(table.get(index) == null){
            table.add(newNode);
        }else {
            //simple implementation
            //Now we need to go through the lInked list. Basically this is a sorted linked list insertion.
            Entry<K,V> currentNode = table.get(index);
            while(currentNode != null){
                if(currentNode.next == null) currentNode.next = newNode;
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            Entry<K,V> prev = null;
            while(currentNode != null){
                //compare the key values and insert the nodes accordingly. if equal replace the value
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
