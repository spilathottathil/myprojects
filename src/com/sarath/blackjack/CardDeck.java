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

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public CardDeck(){
        cardDeck = new ArrayList<Card>();
        for(Suit suit : Suit.values()){
            for(Rank rank: Rank.values()){
                cardDeck.add(new Card(rank,suit));
            }
        }

    }



    public void shuffle(){

        Collections.shuffle(cardDeck);

        //Iterative solution.
        /*for (int i = cardDeck.size(); i >0 ; i--) {
            int j = (int)Math.random()* (i+1);
            Card temp = cardDeck.get(i);
            cardDeck.set(i,cardDeck.get(j));
            cardDeck.set(j,temp);
        }*/
    }


}
