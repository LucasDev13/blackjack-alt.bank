package br.com.blackjackaltbank.domain;

public class Card {

    private String suit;
    private int value;
    private String name;

    public Card() {
    }

    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
