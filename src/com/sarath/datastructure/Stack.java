package com.sarath.datastructure;

import java.util.EmptyStackException;

/**
 * Created by spilathottathil on 11/6/17.
 */
public class Stack <T>{

   private StackNode<T> top;

    public T peek(){
        return top.getData();
    }

    public void push(T data){

        StackNode<T> newNode = new StackNode<T>(data);
       newNode.setNext(top);
        top = newNode;
    }

    public T pop(){
        if(top == null) throw new EmptyStackException();
        T currentTop = top.getData();
        top = top.getNext();
        return currentTop;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
