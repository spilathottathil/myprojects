package com.sarath.datastructure;

/**
 * Created by spilathottathil on 10/4/17.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertNextNode(4);
        list.insertNextNode(6);
        list.insertNextNode(7);
        list.insertNextNode(8);
        list.insertNextNode(9);
        list.insertNextNode(10);
        list.insertNextNode(11);

        list.deleteHeadNode();

        System.out.println(list.searchLinkedList(11));

        System.out.println(list.getLength());

        System.out.println(list);
    }
}
