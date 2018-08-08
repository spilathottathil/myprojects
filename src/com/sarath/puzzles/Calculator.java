package com.sarath.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Sarath Pilathottathil
 * Date 7/11/18 5:26 PM
 * Email : spilathottathil@apple.com
 **/
public class Calculator {

    public static void main(String[] args) {

        String exp = "34+5+7-" ;

        HashMap<String,Integer> mymap = new HashMap<>();

        mymap.put("hello",1);
        mymap.put("whatsup",1);

        for(Map.Entry<String,Integer> myentry : mymap.entrySet()){

            System.out.println(myentry.getKey());
            System.out.println(myentry.getValue());
        }

        String delim = "[+]+";

        String[] exparr = exp.trim().split(delim);

        Integer sum =0;

        for(String str : exparr){
            sum = sum + Integer.valueOf(str);

        }
        System.out.println(sum);

    }

    private void calculate(String exp){

        Stack<Character> mystack = new Stack();

        for (int i = 0; i < exp.length(); i++) {
            Character c = exp.charAt(i);
            if(isOperand(c)){

            }
        }


    }

    private boolean isOperand(Character c){
        return c=='*'|| c=='+' || c=='-' || c=='/';
    }
}
