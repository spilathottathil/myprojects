package com.sarath.puzzles;

import java.util.HashMap;

public class MyTrie {


   private class MyTrieNode{

        private HashMap<Character, MyTrieNode> children;
        private boolean endOfWord;
        private int count;

        public MyTrieNode(){
            children = new HashMap<>();
            endOfWord = false;
            count =0;
        }

    }

    private MyTrieNode root;

    public MyTrie(){
        root = new MyTrieNode();
    }

    public void addEntry(String word){
        MyTrieNode current = root;
        for(int i=0;i<word.length();i++){
            Character ch = word.charAt(i);
            MyTrieNode node = current.children.get(ch);
            if(node == null){
                node = new MyTrieNode();
                current.children.put(ch, node);
            }
            current = node;
            current.count++;
        }
        current.endOfWord = true;

    }

    public int  find(String word){
        MyTrieNode current = root;

            for (int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                MyTrieNode node = current.children.get(ch);
                if (node == null) {
                    return 0;
                }
                current = node;
            }

        return current.count;
    }
}
