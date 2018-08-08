package com.sarath.blackjack.game;

import com.sarath.blackjack.*;

import java.util.List;

/**
 * Created by spilathottathil on 11/1/17.
 */
public class BlackJackHand extends Hand {

    private List<Card> blackJackHand;

    public BlackJackHand(List<Card> blackJackHand){
        this.blackJackHand = blackJackHand;

    }
    public boolean isBusted(){
        return  getScore(blackJackHand) > 21;
    }

    public  boolean isBlackJack(){
      return   (getScore(blackJackHand) == 21 && blackJackHand.size() == 2 && blackJackHand.contains(Suit.SPADE )
                && blackJackHand.contains(Rank.ACE));

    }

    public List<Card> getBlackJackHand() {
        return blackJackHand;
    }

    public boolean is21(){

        return getScore(blackJackHand)==21;
    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.shuffle();
        Hand hand = new Hand();
        for (int i = 0; i < 3; i++) {
           List<Card> myHand =  hand.getHand(cardDeck.getCardDeck(),2);
            BlackJackHand blackJackHand = new BlackJackHand(myHand);
         if(blackJackHand.isBlackJack()){
             System.out.println("Black Jack..Yayyyy");
         }

            if(blackJackHand.isBusted()){
                System.out.println("Busted");
            }
            if(blackJackHand.getScore(myHand) <21){
                //get new card
                blackJackHand.getBlackJackHand().add(hand.getHand(cardDeck.getCardDeck(),1).get(0));
                System.out.println(myHand);
            }
        }


    }

}
