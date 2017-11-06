package com.sarath.datastructure;

/**
 * Created by spilathottathil on 11/6/17.
 */
public class StackNode<T> {

    private T data;
    private StackNode<T> next;

    public StackNode(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public StackNode<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(StackNode<T> next) {
        this.next = next;
    }
}
