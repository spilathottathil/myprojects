package com.sarath.algorithms;

/**
 * Created by spilathottathil on 11/3/17.
 */
public class Questions {
    //Merge two sorted arrays A and B
    private static  Integer[] mergeArrays(Integer[] left, Integer[] right){
        int n1 = left.length;
        int n2 = right.length;

        Integer[] outArray = new Integer[n1];

        int i=0,j=0,k=0,l=0;


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
        Integer[] left = new Integer[] {5,23,34,45,null,null,null};
        Integer[] right = {6,10,46};
       Integer[] out= mergeArrays(left,right);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

    }
}
