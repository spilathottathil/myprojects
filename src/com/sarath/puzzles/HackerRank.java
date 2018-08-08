package com.sarath.puzzles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sarath Pilathottathil
 * Date 6/19/18 11:30 AM
 * Email : spilathottathil@apple.com
 **/
public class HackerRank {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int[] grades = {75,67,38,33};


        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(result[resultItr]);
        }

    }

    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] gradeout = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            int grade = grades[i];
            if(grade % 5 ==0 || grade < 38 ){
                gradeout[i]= grade;
            }else{
                int diff = getNextMultiple(grade);
                if(diff < 3){
                    gradeout[i] = grade + diff;
                }else{
                    gradeout[i]= grade;
                }
            }
        }
        return gradeout;
    }

    private static int getNextMultiple(int n){
        int i=1;
        while(i <=5){
            if((n +i) % 5 == 0){
                break;
            }
            i++;
        }
        return i;
    }
}
