package com.sarath.algorithms;

/**
 * Created by spilathottathil on 10/25/17.
 */
public class InsertionSort {

    public static void main(String[] args) {


        int[] arrayA = {10,8};
        insertionSort(arrayA);
        //print sorted array
        System.out.println("\nsorted array is: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]+" ");

        }

    }

    private static  void insertionSort(int[] arrayIN){
        int N = arrayIN.length;

        for (int i = 0; i <N ; i++) {
            int current = arrayIN[i];
            int j = i-1;
            while(j>=0 && arrayIN[j] > current){
                arrayIN[j+1] = arrayIN[j];
                j =j-1;
            }
            arrayIN[j+1] = current;
        }
    }
}
