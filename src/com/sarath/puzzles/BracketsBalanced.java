package com.sarath.puzzles;

import com.sarath.datastructure.Stack;

public class BracketsBalanced {

    static  Stack<Character> myStack = new Stack();
    static  String input = "[()][{}]{[({})[]]}";
    public static void main(String[] args) {

        System.out.println(checkBalanaced(input));
    }

    private static  boolean checkBalanaced(String word) {

        //
        for (int i = 0; i < input.length() ; i++) {

            Character ch = input.charAt(i);

            switch (ch){
                case '{' :  myStack.push('}'); break;
                case '[' :  myStack.push(']'); break;
                case '(' :  myStack.push(')'); break;

                default: if( myStack.peek() != ch || myStack.isEmpty()){
                    return false;

                }
                    myStack.pop();
            }

        }
        return myStack.isEmpty();
    }




}
