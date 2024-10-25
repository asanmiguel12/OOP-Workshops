package com.pluralsight;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Player() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
//
//        this.name = name;
//        this.hand = new Hand();
//
//    }
}