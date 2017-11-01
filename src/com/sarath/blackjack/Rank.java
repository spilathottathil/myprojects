package com.sarath.blackjack;

/**
 * Created by spilathottathil on 11/1/17.
 */
public enum Rank {

    ACE(11),KING(10),QUEEN(10),JACK(10),TEN(10),NINE(9),EIGHT(8),SEVEN(7),SIX(6),FIVE(5),FOUR(4),
    THREE(3),TWO(2),ONE(1);

    private int rankValue;
    private Rank(int rankValue){
        this.rankValue = rankValue;
    }

    public int getRankValue() {
        return rankValue;
    }
}
