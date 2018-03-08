package com.sarath.puzzles;

import java.util.Scanner;

public class MyTriePuzzle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MyTrie myTrie = new MyTrie();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                myTrie.addEntry(contact);
            }else{

                System.out.println(myTrie.find(contact));
            }
        }

    }
}
