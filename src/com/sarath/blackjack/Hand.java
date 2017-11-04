package com.sarath.blackjack;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spilathottathil on 11/1/17.
 */
public class Hand  {



    public int getScore(List<Card> cardDeck ){

        int score =0;
        for (Card card : cardDeck){
            score += card.getRank().getRankValue();

        }
        return score;
    }



    public  List<Card> getHand(List<Card> listCard, int number){

        List<Card> handView = listCard.subList(listCard.size()-number,listCard.size());
        List<Card> hand = new ArrayList<Card>(handView);
        handView.clear();
        return hand;

    }

}
