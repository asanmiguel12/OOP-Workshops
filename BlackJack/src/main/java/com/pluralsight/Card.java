package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        // only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            if (value.equalsIgnoreCase("K")) {
                return 10;
            }
            else if (value.equalsIgnoreCase("Q")) {
                return 10;
            }
           else if (value.equalsIgnoreCase("J")) {
                return 10;
            }
           else if (value.equalsIgnoreCase("A")) {
                return 11;
            }
            return Integer.valueOf(getValue());
            } else {
                return 0;
            }
        }

    public boolean isFaceUp () {
            return isFaceUp;
        }

    public void flip () {
            isFaceUp = !isFaceUp;
        }
    }