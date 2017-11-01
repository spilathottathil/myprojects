package com.sarath.algorithms;

import java.util.Scanner;

/**
 * Created by spilathottathil on 10/24/17.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arrayA = {10,8,99,45,3,2};
        selectionSort(arrayA,arrayA.length);
        //print sorted array
        System.out.println("\nsorted array is: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i] + " ");

        }
    }

    private static void selectionSort(int[] arrayIN, int n){
        for (int i = 0; i < n-1; i++) {

            int minInd = i;
            for (int j = i+1; j < n; j++) {
                if (arrayIN[j] < arrayIN[minInd]){
                    minInd = j;
                    //swap elements
                    int temp = arrayIN[j];
                    arrayIN[j]= arrayIN[i];
                    arrayIN[i]=temp;
                }

            }

        }


    }
}
