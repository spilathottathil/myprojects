package com.sarath.puzzles;


import com.sarath.datastructure.Stack;

import java.util.ArrayList;

/**
 * Created by spilathottathil on 11/14/17.
 */
public class ExpressionTree {
    //Expression is 3 + ((5+9)*2)

    static class MyTreeNode{
        char root;
        MyTreeNode left, right;
        MyTreeNode(char data){
           root = data;
            left=right=null;
        }
    }

    /**
     * methojd to create postfix from infix.
     * @param exp
     * @return
     */
    private static  String infixToPostFix(String exp){
      java.util.Stack<String> expStack = new java.util.Stack<>();


        StringBuilder out = new StringBuilder();
        for (int i = 0; i < exp.length() ; i++) {
            char current = exp.charAt(i);

/*
            if(current == '('){
                //push to stack
                expStack.push(String.valueOf(current));
            } else if (current == ')'){

                    while (!expStack.isEmpty() && expStack.peek().charAt(0) != '(') {
                        out.append(expStack.pop());
                    }
                    if (expStack.isEmpty() || expStack.peek().charAt(0) != '(') {
                        return "Invalid expression";
                    } else{
                        expStack.push(String.valueOf(current));
                    }


            }else*/ if(!isOperator(current)){
                //push to the o/p
                out.append(String.valueOf(current));
            }
            else {
                //need to check the precedence
                if( expStack.isEmpty()){
                    expStack.push(String.valueOf(current));
                }else {
                    //pop till u get a less precedence operator.
                    while( !expStack.isEmpty() && getPrecedence(current) >= getPrecedence(expStack.peek().charAt(0))){
                      out.append(expStack.pop());
                    }
                    expStack.push(String.valueOf(current));
                }
            }
        }

       //Now the stack is in the order of ascending order of precedence.
        while (!expStack.isEmpty()){
            out.append(expStack.pop());
        }
        return  out.toString();
    }

    private  static  int getPrecedence(char c){
        int precedence =0;
        switch(c){
            case '/' : precedence =4;
                break;
            case '*' : precedence =3;
                break;
            case '-' : precedence =2;
                break;
            case '+' : precedence =1;
                break;
        }
        return precedence;
    }

    /**
     *
     * @param expr
     * @return
     */

    private static MyTreeNode createExpressionTree(char[] expr){
        java.util.Stack<MyTreeNode> myStack = new java.util.Stack();
        MyTreeNode t=null, t1,t2;
        for (int i = 0; i < expr.length; i++) {
            char current = expr[i];
            if(isOperator(current) && !myStack.empty()){
                //add as root and pop two values from stack to add as left and right nodes.
                t = new MyTreeNode(current);
                t1 = myStack.pop();
                t.left = t1;
                if(!myStack.isEmpty()) {
                    t.right = myStack.pop();
                }
                myStack.push(t);

            }else {
                //push to stack
               t = new MyTreeNode(current);
                myStack.add(t);
            }

        }


        return t;
    }

    private static boolean isOperator(char c){
        return (c == '+' || c== '-' || c=='*' || c=='/') ;
    }


    public static void main(String[] args) {

        String expr = infixToPostFix("37*2/3");

        System.out.println(expr);

        MyTreeNode t =  createExpressionTree(expr.toCharArray());

       // printInOrder(t);

        //Now evaluate the expression tree.
        System.out.println(evaluateExpressionTree(t));
   }

    private static int evaluateExpressionTree(MyTreeNode node){

       if(node == null ) return 0;

        if(node.left == null || node.right == null ) return Character.getNumericValue(node.root);
       int left = evaluateExpressionTree(node.left);
       int right = evaluateExpressionTree(node.right);
        return solveEquation(node.root,left,right);
    }

    private static  int solveEquation(char c, int left, int right){

        switch (c){
            case '+' : return left + right;
            case '-' : return left - right;
            case '*' : return left * right;
            case '/' : return left /right;
            default: throw new RuntimeException("invalid");
        }

    }

    private static void printInOrder(MyTreeNode node){
        if(node != null){
            printInOrder(node.left);
            System.out.println(node.root);
            printInOrder(node.right);
        }
    }

}
