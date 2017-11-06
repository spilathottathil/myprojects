package com.sarath.datastructure;

import java.util.NoSuchElementException;

/**
 * Created by spilathottathil on 11/6/17.
 */
public class Queue<T> {

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> head;
    private QueueNode<T> tail;

    public T peek(){
        if(head == null) throw new NoSuchElementException();
        return head.data;
    }

    public void insert(T data){
        QueueNode<T> newNode = new QueueNode<>(data);
        if(tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
    }
}
