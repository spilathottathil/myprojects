package com.sarath.algorithms;


import java.util.ArrayList;

/**
 * Created by spilathottathil on 10/13/17.
 */
public class MergeSort {


    public static void main(String[] args) {

        Integer[] arrayIN = {23,77,2,34,89,5};

        System.out.println("Given array is ");
        printArray(arrayIN);
        mergeSort(arrayIN,0,arrayIN.length-1);

        System.out.println("\nsorted array is ");
        printArray(arrayIN);

    }

    private static <T extends Comparable<T>> void printArray(T [] arrayIn){
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println(arrayIn[i]+ ",");

        }

    }

    /**
     *
     * @param arrayInput
     * @param start
     * @param end
     */
    private static <T extends Comparable<T>> void mergeSort(T [] arrayInput, int start, int end){

        if(start < end){
            int middle = (start + end)/2;

            mergeSort(arrayInput,start,middle);

            mergeSort(arrayInput,middle+1, end);

            merge(arrayInput,start,middle,end);

        }


    }
    private static  <T> ArrayList<T> getList(int size){
        return new ArrayList<T>(size);
    }

    private static <T extends Comparable<T>> void merge(T[] arrayIn,int start, int middle, int end){

        int n1 = middle -start +1;
        int n2 = end - middle;

        ArrayList<T> left = getList(n1);
        ArrayList<T> right = getList(n2);

        //copy first array over n1
        for (int i = 0; i <n1 ; i++) {
            left.add(arrayIn[i+start]) ;
        }

        for (int j = 0; j < n2 ; j++) {
            right.add(arrayIn[middle+1+j]);

        }

        //copy secind array over n2

        int i=0,j=0,k=start;

        while(i<n1 && j<n2){

            if(left.get(i).compareTo(right.get(j))<=0){

                arrayIn[k] = left.get(i);
                i++;
            }else {
                j++;
            }
            k++;
        }
        //Now copy the remaining elements if the lengths are not same.
        while(i<n1){
            arrayIn[k] = left.get(i);
            i++;
            k++;
        }
        //Sly right.

    }




}
