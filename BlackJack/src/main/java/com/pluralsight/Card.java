package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;
    static ArrayList<String> cards = new ArrayList<>();
    String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
    String[] values = {"2","3","4","5","6","7","8",
            "9","10","J","Q","K","A"};

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        // only return the suit if the card is face up
        if (isFaceUp) {
            for (int i = 0; i < suits.length; i++) {
                return suit;
            }
        }
        return suit;
    }

    public String getValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            return value;
        } else {
            return value;
        }
    }

    public int getPointValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            if (value.equalsIgnoreCase("K")) {
                return 10;
            } else if (value.equalsIgnoreCase("Q")) {
                return 10;
            } else if (value.equalsIgnoreCase("J")) {
                return 10;
            } else if (value.equalsIgnoreCase("A")) {
                return 11;
            } else
            return Integer.valueOf(getValue());
        }
        return 0;
    }

    public boolean isFaceUp () {
            return isFaceUp;
        }

    public void flip () {
            isFaceUp = !isFaceUp;
        }
    }