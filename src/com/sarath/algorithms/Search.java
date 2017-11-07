package com.sarath.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by spilathottathil on 8/24/17.
 */
public class Search {

    //This is the common template for every program.
    public static void main (String args[]){

        //Input the number of test cases

        String str = "ami a goodprogrammer";
        System.out.println(splitString(str,' '));
        //int t= sc.nextInt();


        if(!str.isEmpty()) {
            List<String> sb = reverseString(str);

            for (String mystring : sb) {
               //System.out.print(mystring);
            }
        }



        /*int[] myArr = new int[100];

        while(t>0){
            //size of the array
            int n = sc.nextInt();

            //input the array
            for(int i=0;i<n;i++){
                myArr[i]=sc.nextInt();
            }
            //input the search element
            //int x = sc.nextInt();

            //output
          //  System.out.println(myBinarySearch(myArr,0,n-1,x));
         int[] outArray=   quickSort(myArr,0, n);

            for (int i = 0; i <n-1 ; i++) {

                System.out.println(outArray[i]+" ");

            }

        }*/

    }


    /**
     * Binary search : 1.Sort the array
     * 2. Split the array in to half and check the middle number
     * 3. If that x > number left else right
     * 4. Continue until the number is found.
     */

    private static  int myBinarySearch(int[] myarr, int start,int end, int x){

       if(end >=1) {
           //Split the array
           int mid = start+  (end - start) / 2;


           if(mid==x)
               return mid;

           if (x < myarr[mid]) { //left
               return myBinarySearch(myarr, start, mid - 1, x);

           }
           if(x> myarr[mid] ){//right
             return   myBinarySearch(myarr, mid + 1, end, x);
           }

           return mid;
       }else
            return -1;
    }

    private static int searchX(int[] myArr, int n,int x){
        for(int i=0;i<n;i++){
            if(myArr[i]== x){
                return i;
            }
        }
       return -1;
    }

    private static int[] quickSort(int[] arr, int low, int high){

    if(low <high) {
        //partitionn logic
        int pivotP = partitionArray(arr, low, high);


        quickSort(arr, low, pivotP -1);
        quickSort(arr,pivotP+1,high);


    }
        return arr;
    }

    private static int partitionArray(int[] arr, int low,int high){

        //pivot is the last element
        int pivot = arr[high];

        //poistion of pivot is high

        //position of low
        int i = low -1;

        //now loop through array and position all small elements to left og pivot
        for (int j = low; j <high-1; j++) {

            if(arr[j] <= pivot){
                //increment i
                i++;
                //swap elements : arr[i] and arr[j]
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;

            }

        }
        //now swap the pivot
        int temp = arr[i+1];
        arr[i+1]= pivot;
        arr[high]=temp;

        //position of pivot
        return i+1;

    }

    private static List<String> reverseString(String inputString){
        //split the String.
        //find the indexes for spaces.

        List<String> spliStrings = splitString(inputString,' ');

        StringBuilder sb = new StringBuilder(5000);

        List<String> strintOut = new ArrayList<String>();

        for (String str : spliStrings){


            strintOut.add(reverseIndString(str));
            strintOut.add(" ");

        }


        return strintOut;
    }

    private static List<String> splitString(String strToSplit, char delimiter){



        List<String>  listString = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= strToSplit.length()-1; i++) {

            if(strToSplit.charAt(i)==delimiter){
                listString.add(sb.toString());
                sb.setLength(0);
            }else {
                sb.append(strToSplit.charAt(i));
            }

        }
        listString.add(sb.toString());
       return listString;

    }

    private static String reverseIndString(String inputString){
        char[] outChar = new char[100];
        int j=0;

        for (int i = inputString.length()-1; i >=0 ; i--) {
            outChar[j] = inputString.charAt(i);
            j++;
        }
        return  new String(outChar);

    }


}
