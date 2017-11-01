package com.sarath.blackjack;

/**
 * Created by spilathottathil on 11/1/17.
 */
public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank,Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Card(){

    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return "This card is "+rank+" of"+suit;
    }
}
