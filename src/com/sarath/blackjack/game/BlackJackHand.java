package com.sarath.blackjack.game;

import com.sarath.blackjack.Card;
import com.sarath.blackjack.Hand;
import com.sarath.blackjack.Rank;
import com.sarath.blackjack.Suit;

import java.util.List;

/**
 * Created by spilathottathil on 11/1/17.
 */
public class BlackJackHand extends Hand {


    public boolean isBusted(){
        return  getScore() > 21;
    }

    public boolean isBlackJack(List<Card> cards){
      return   (getScore() == 21 && cards.size() == 2 && cards.contains(Suit.SPADE )
                && cards.contains(Rank.ACE));

    }

    public boolean is21(){

        return getScore()==21;
    }

}
