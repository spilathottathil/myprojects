package com.sarath.blackjack;

/**
 * Created by spilathottathil on 11/1/17.
 */
public enum Suit {
    CLUBS(0),DIAMOND(1),HEARTS(1),SPADE(3);

    private int cardSuit;
    Suit(int cardSuit){
        this.cardSuit = cardSuit;
    }

    public int getCardSuit() {
        return cardSuit;
    }


}
