package com.sarath.datastructure;

/**
 * Created by spilathottathil on 10/4/17.
 */
public class LinkedList {
    private Node head;

    public void insertNextNode(int data){
        Node newNode = new Node(data);

        newNode.setNextNode(this.head);
        //point the head to new node.
        this.head = newNode;


    }

    boolean searchLinkedList(int searchData){
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.getData() == searchData){
                return true;
            }
                currentNode = currentNode.getNextNode();

        }
        return false;
    }

    void insertAtSortedList(Node newNode){
        Node currentNode = this.head;
        while(currentNode != null){
            if(currentNode.getNextNode().getData() > newNode.getData()){

                Node newNextNode = newNode.getNextNode();

                newNextNode = currentNode.getNextNode();

                currentNode = newNode ;


            }else{
                currentNode = currentNode.getNextNode();
            }

        }

    }

    public int getLength(){

        int length = 0;
        Node currentNode = this.head;

        while(currentNode != null){
            length++;
            currentNode = currentNode.getNextNode();

        }

        return length;

    }

    void deleteHeadNode(){
         this.head = this.head.getNextNode();

    }

    @Override
    public String toString() {
        String result = "{";

        Node current = this.head;

        while (current != null){
            result += current.toString();
            if(current.getNextNode()!=null){
                result += ",";
            }
            current = current.getNextNode();
        }
        return result + "}";
    }
}
