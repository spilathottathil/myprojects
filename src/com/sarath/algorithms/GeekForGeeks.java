package com.sarath.algorithms;

import java.util.Scanner;

/**
 * Created by spilathottathil on 9/27/17.
 */
public class GeekForGeeks {
    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        //get no of test cases
        int T = scanner.nextInt();
        for(int t=0;t<T;t++){
            scanner.nextLine();
            int N = scanner.nextInt();
            scanner.nextLine();
            //input the array
            int[] inArr = new int[N];
            for(int i=0;i<N;i++){
                inArr[i] = scanner.nextInt();
            }
            //System.out.println(getHighestNumber(inArr,N));
        }
        scanner.close();
    }
}
