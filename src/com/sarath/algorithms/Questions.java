package com.sarath.algorithms;

import com.sarath.datastructure.LinkedList;
import com.sarath.datastructure.Node;

/**
 * Created by spilathottathil on 11/3/17.
 */
public class Questions {
    //Q1: Merge two sorted arrays A and B
    private static  Integer[] mergeArrays(Integer[] left, Integer[] right){
        int n1 = left.length;
        int n2 = right.length;

        Integer[] outArray = new Integer[n1];

        int i=0,j=0,k=0;


            while(j<n2 && i<n1){

                if(left[i] !=null &&left[i] <= right[j]){
                    outArray[k]= left[i];
                    i++;
                }else {
                    outArray[k]=right[j];
                    j++;
                }
                k++;
            }

        while(j<n2 && i<n1){
            if(left[i]!=null && left[i] <= right[j]){
                outArray[k]= left[i];
                i++;
            }else {
                outArray[k]=right[j];
                j++;
            }

        }


        //Now copy remaining elements if any

        while(k<n1){
            outArray[k] = left[i];
            i++;
            k++;
        }

        while(j<n2){
            outArray[k] = right[j];
            j++;
            k++;
        }
        return outArray;
    }

    public static void main(String[] args) {
       /* Integer[] left = new Integer[] {5,23,34,45,null,null,null};
        Integer[] right = {6,10,46};
       Integer[] out= mergeArrays(left,right);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }*/

        LinkedList list = new LinkedList();

        // creating first list
        list.setHead(new Node(7));
        list.getHead().setNextNode(new Node(5));
        list.getHead().getNextNode().setNextNode(new Node(9));
        System.out.print("First List is \n");
        printLinkedList(list.getHead());

        // creating seconnd list
        LinkedList list2 = new LinkedList();
        list2.setHead(new Node(8));
        list2.getHead().setNextNode(new Node(4));
        System.out.print("Second List is \n");
        printLinkedList(list2.getHead());

        System.out.print("Reversed List is \n");

        printLinkedList(LinkedList.reverseList(list.getHead()));

        // add the two lists and see the result
        Node rs = getSumofList(list.getHead(),list2.getHead());
        System.out.print("Resultant List is \n");
        printLinkedList(rs);



    }

    private static void printLinkedList(Node n){
        while(n !=null){
            System.out.println(n.toString());
            n = n.getNextNode();
        }
    }

    //Q2: Get sum from two linked lists. Note the lists are reversed.
    private static Node getSumofList(Node first, Node second){

        int sum=0;
        int carry =0;
        Node result = null;

        LinkedList resultList = null;

        //Traverse the two nodes
        while(first != null || second != null){

            sum = (first!= null ? first.getData() : 0 )+  (second != null ? second.getData() : 0 )+ carry;

            carry = sum >= 10 ? 1 : 0;

            sum = sum %10;
            //if first then it is head
            if(resultList == null) {
                resultList = new LinkedList();
                resultList.setHead(new Node(sum));
                result = resultList.getHead();
            }else {
                result.setNextNode(new Node(sum));
                result = result.getNextNode();
            }
            if(first!=null) {
                first = first.getNextNode();
            }
            if(second !=null) {
                second = second.getNextNode();
            }
            if(carry > 0){
                result.setNextNode(new Node(carry));
            }

        }

        return resultList.getHead();
    }

    //Q3: Length of longest common sub sequence.
    public static int getLOfSubSequence(char[] x, char[] y, int n, int m){
        //if the last characters are the same.
        if(x[n-1]==y[m-1]){
            return 1+getLOfSubSequence(x,y,n-1,m-1);
        }else {
            return Math.max(getLOfSubSequence(x,y,n-1,m) , getLOfSubSequence(x,y,n,m-1));
        }

    }

    public void printLongestSubSequence(char[] x, char[] y, int n, int m){
        //
        int k = getLOfSubSequence( x, y, n, m);
        char[] out = new char[k];

        int i=n, j=m;

        while (i>0 && j>0){
            if(x[i-1] == y[j-1]){
                out[k-1] = x[i-1];
                i--;
                j--;
            }else {
               // if(x[i])
            }
        }
    }

    public static String permute(String str, int left, int right){

        for (int i = left; i < right; i++) {
          if(left == right){
              return str;
          }
          swap(str, i,left+1);
           permute(str,i,left+1);
        }
        return null;
    }

    private static  void swap(String str, int left, int right){

    }

    //Design a calculator with String as input.
}
