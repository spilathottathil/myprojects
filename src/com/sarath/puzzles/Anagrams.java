package com.sarath.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static int numberNeeded(String first, String second) {
        int count =0 ;


        HashMap<Character, Integer> firstMap = new HashMap<>();


        for(int i=0;i<first.length();i++){
            Character c =  first.charAt(i);
            if(firstMap.get(c) == null){
                firstMap.put(c,1);
            }else{
                firstMap.put(c,firstMap.get(c) + 1);
            }
        }
        for(int i=0;i<second.length();i++){
            Character d =  second.charAt(i);
            if(firstMap.get(d) != null ){
                if(firstMap.get(d) != 0){
                    firstMap.put(d, firstMap.get(d) - 1 );
                }else{
                    firstMap.remove(firstMap.get(d));
                }
            }else{
                count++;
            }
        }

        for(Map.Entry<Character, Integer> myMapEntry : firstMap.entrySet()){

            count = count + myMapEntry.getValue();
        }

        return count;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        if(a.length() >= b.length()){
            System.out.println(numberNeeded(a, b));
        }else{
            System.out.println(numberNeeded(b, a));
        }

    }
}
