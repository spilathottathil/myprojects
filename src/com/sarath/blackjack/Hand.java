package com.sarath.blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spilathottathil on 11/1/17.
 */
public class Hand  {
    private List<Card>  cardList = new ArrayList<>();

    public int getScore(){

        int score =0;
        for (Card card : cardList){
            score += card.getRank().getRankValue();

        }
        return score;
    }

    public void addCard(Card card){
        cardList.add(card);
    }

}
