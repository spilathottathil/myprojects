package com.sarath.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by spilathottathil on 11/1/17.
 */
public class CardDeck  {

    private List<Card> cardDeck;
    private int dealtIndex= 0;

   public CardDeck(){
        cardDeck = new ArrayList<Card>();
        dealtIndex=0;
        for(Suit suit : Suit.values()){
            for(Rank rank: Rank.values()){
                cardDeck.add(new Card(rank,suit));
            }
        }

    }

    public void dealCards(int number){
        int i=0;
        while( i< number){
            dealtIndex --;
            i++;
        }

    }

    public void shuffle(){
        Collections.shuffle(cardDeck);
    }


}
