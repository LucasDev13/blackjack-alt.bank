package br.com.blackjackaltbank.domain;

import java.util.ArrayList;

public class Player {

    private int id;
    private String name;
    private ArrayList<Card> hand;
    private int point;

    public Player() {
        point = 0;
        id = (int) System.currentTimeMillis() % 1000;
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.point += card.getValue();
        this.hand.add(card);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
