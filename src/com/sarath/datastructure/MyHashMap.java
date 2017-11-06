package com.sarath.datastructure;

/**
 * Created by spilathottathil on 11/6/17.
 */
public class MyHashMap<K,V> {
    K key;
    V value;
    MyHashMap<K,V> next;
    Integer size = 5;

    public MyHashMap(K key,V value, MyHashMap<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void get(K key){
      int index = key == null ? 0 : key.hashCode();

    }
}
