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
    public String getSuit(){
    // only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return  "#";
        }
    }
    public String getValue(){
    // only return the value if the card is face up
        if(isFaceUp) {
            return value;
            } else {
            return "#";
        }
    }
    public int getPointValue() {
    // only return the value if the card is face up
        if(isFaceUp){
            String[] faceCards = {"K", "Q", "J" };
            for (String KThroughQ: faceCards) {
                KThroughQ = "10";
                int KThroughQValue = Integer.parseInt(KThroughQ);
                return Card.this.getPointValue();
            }
                String[] Ace = {"11","1"};
                for (String A : faceCards) {
                    int AceValue = Integer.parseInt(A);
                    return AceValue;
                }
    // determine point value and return it A = 11 - K, Q, J = 10 - numbered cards are equal to their face value
        } else {
            String[] values = {"2","3","4","5","6","7","8","9","10"};
            for(String numberValue: values){
                int pointValue = Integer.parseInt(numberValue);
                return 0;
            }
        }
        return getPointValue();
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}