package com.sarath.algorithms;

import java.util.Stack;

/**
 * Created by spilathottathil on 10/13/17.
 */
public class TowerOfHanoi {

    public static void main(String[] args) {

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

        //n=3

        towerOfHanoi.move(3,'A','C','B');
        //towerOfHanoi.move(1,'A','C','B');
        //towerOfHanoi.move(2,'B','C','A');

    }

    private void move(Integer numDiscs, char source, char dest, char inter){

        if(numDiscs==1){

            System.out.println("Moving disc 1 from " + source + " to " + dest);

        }else {

            move(numDiscs - 1, source, inter, dest);

            System.out.println("Moving disc " + numDiscs + " from " + source + " to " + dest);

            move(numDiscs - 1, inter, dest, source);

        }



    }

}
