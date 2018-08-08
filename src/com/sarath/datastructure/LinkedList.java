package com.sarath.datastructure;

import java.util.HashSet;

/**
 * Created by spilathottathil on 10/4/17.
 */
public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertNextNode(int data) {
        Node newNode = new Node(data);

        newNode.setNextNode(this.head);
        //point the head to new node.
        this.head = newNode;


    }

    boolean searchLinkedList(int searchData) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.getData() == searchData) {
                return true;
            }
            currentNode = currentNode.getNextNode();

        }
        return false;
    }


    void insertAtSortedList(Node newNode) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.getNextNode().getData() > newNode.getData()) {
                newNode.setNextNode(currentNode.getNextNode());
                currentNode.setNextNode(newNode);
            } else {
                currentNode = currentNode.getNextNode();
            }
        }

    }

    public int getLength() {

        int length = 0;
        Node currentNode = this.head;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNextNode();

        }

        return length;

    }

    void deleteHeadNode() {
        this.head = this.head.getNextNode();

    }

    @Override
    public String toString() {
        String result = "{";

        Node current = this.head;

        while (current != null) {
            result += current.toString();
            if (current.getNextNode() != null) {
                result += ",";
            }
            current = current.getNextNode();
        }
        return result + "}";
    }

    //Program to delete last occurance of a list.
    public void DeleteKey(Node head, int key) {
        Node prev = null;
        Node current = head;
        Node temp = null;

        while (current != null) {
            if (current.getNextNode() != null && current.getData() == key) {
                prev = current;
                temp = current.getNextNode();
            }
            current = current.getNextNode();
        }
        //now delete the node.
        prev.setNextNode(temp);
        current.setNextNode(null);
    }

    public void removeDuplicates(Node head) {

        Node prev = null;
        Node current = head;
        HashSet<Integer> hashSetNodes = new HashSet<>();

        while (current != null) {
            if (hashSetNodes.contains(current.getData())) {
                prev.setNextNode(current.getNextNode());
            } else {
                hashSetNodes.add(current.getData());
                prev = current;
            }
            current = current.getNextNode();
        }

    }
    //Get Nth element from a linked list.
    public  int getElement(int n){
        Node current = this.head;
        int counter = 0;
        if(n==0){
            return this.head.getData();
        }
        while(current != null){
            current = current.getNextNode();
            if(counter == n){
                return current.getData();
            }
            counter ++;
        }
        return n;
    }

    public static Node reverseList(Node current){

      Node prev = null;
      Node next;
        if(current == null || current.getNextNode() ==null){
            return current;
        }

        while(current!=null){
            next = current.getNextNode();
            current.setNextNode(prev);
            prev = current;
            current = next;
        }
        return prev;
    }

    public void printLinkedList(Node node){
        while(node != null){
            System.out.println(node.getData());
            node = node.getNextNode();
        }
    }

    public void printLinkedListRecurse(Node node){
       if(node == null){
           return;
       }else {
           System.out.println(node.getData());
           printLinkedList(node.getNextNode());
       }
    }

    public  Node removeDuplicates2(Node head) {


        if(head == null){
            return head;
        }
        Node current = head;
        LinkedList newList = new LinkedList();
        newList.insertNextNode(current.getData());
        while(current.getNextNode() != null){
            if(current == current.getNextNode()){
                current = current.getNextNode().getNextNode();
            }else{
                current = current.getNextNode();
            }
            newList.insertNextNode(current.getData());
        }
        return newList.head;
    }


}
