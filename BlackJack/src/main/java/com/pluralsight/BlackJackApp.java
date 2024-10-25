package com.pluralsight;

public class BlackJackApp
{
    public static void main( String[] args ) {

        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Adrian");
        Hand hand1 = new Hand();
        Player player2 = new Player("Gabe");
        Hand hand2 = new Hand();

        /* deal 2 cards to each player */
        for (int i = 0; i < 2; i++) {
            /* get a card from the deck */
            Card cards1 = deck.deal();
            /* deal that card to the hand */
            hand1.deal(cards1);



            Card cards2  = deck.deal();
            hand2.deal(cards2);



            System.out.println(player1.getName() + "'s card : " + cards1.getValue() + " of " + cards1.getSuit());
            System.out.println(player2.getName() + "'s card : " + cards2.getValue() + " of " + cards2.getSuit());


        }
        int handValue = hand1.getValue();
        int handValue2 = hand2.getValue();
        System.out.println(player1.getName() + "'s hand: " + handValue);
        System.out.println(player2.getName() + "'s hand: " + handValue2);
        System.out.println("Your deck has " + deck.getSize() + " cards left");

    }
}


