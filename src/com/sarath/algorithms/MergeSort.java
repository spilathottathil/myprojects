package com.sarath.algorithms;



/**
 * Created by spilathottathil on 10/13/17.
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arrayIN = {23,77,2,34,89,5};

        System.out.println("Given array is ");
        printArray(arrayIN);
        mergeSort(arrayIN,0,arrayIN.length-1);

        System.out.println("\nsorted array is ");
        printArray(arrayIN);

    }

    private static void printArray(int[] arrayIn){
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
    private static void mergeSort(int[] arrayInput, int start, int end){

       if(start < end){
           int middle = (start + end) /2;
           mergeSort(arrayInput,start,middle);
           mergeSort(arrayInput,middle+1,end);
           merge(arrayInput,start,middle,end);
       }


    }

    private static void merge(int[] arrayIn,int start, int middle, int end){

        int n1 = middle - start +1;
        int n2 = end -middle;

        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1 ; i++) {
            left[i] = arrayIn[i+ start];
        }

        for (int i = 0; i < n2 ; i++) {
            right[i] = arrayIn[i + middle+1];
        }

        int i=0,j=0,k=start;
        //now compare
        while (i<n1 && j <n2){
            if(left[i] <=right[j]){
                arrayIn[k] = left[i];
                i++;
            }else {
                arrayIn[k] = right[j];
                j++;
            }
            k++;
        }

        //copy the remaining elemnts if lengths are not same.

        while (i<n1){
            arrayIn[k] = left[i];
            i++;
            k++;
        }

        while (j<n2){
            arrayIn[k] = right[j];
            j++;
            k++;
        }

    }


}
