package com.sarath.puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Sarath Pilathottathil
 * Date 5/27/18 7:37 PM
 * Email : spilathottathil@apple.com
 **/
public class RandomSubList {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15 ; i++) {
            list.add(i);
        }
        //Now create the sublist based on flipping the coin.

        Predicate<Object> flipCoin =  o ->  random.nextBoolean();

        System.out.println(list.stream().filter(flipCoin).collect(Collectors.toList()));

    }
}
