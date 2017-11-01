package com.sarath.algorithms;

import java.util.Scanner;

/**
 * Created by spilathottathil on 10/24/17.
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //no of test cases
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            sc.nextLine();
            //no of elements
            int N = sc.nextInt();
            //input the array
            int  intArr[] = new int[N];
            for (int i = 0; i < N ; i++) {
                intArr[i] = sc.nextInt();
            }
            bubbleSort(intArr);
            //print sorted array
            System.out.println("\nsorted array is: ");
            for (int i = 0; i < N; i++) {
                System.out.println(intArr[i]+" ");

            }
        }
        sc.close();
    }

    private static void bubbleSort(int[] inArr){

        for (int i = 0; i < inArr.length ; i++) {

            for (int j = 0; j < inArr.length - 1; j++) {

                if(inArr[i] <= inArr[j]){
                    //swap elements
                    int temp = inArr[i];
                    inArr[i]= inArr[j];
                    inArr[j]=temp;
                }

            }

        }
    }

}
