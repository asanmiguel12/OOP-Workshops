package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DealershipFileManager {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);

    public String getDealership() throws IOException {
        FileReader fileReader = new FileReader("carInventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input = bufferedReader.readLine();
        String[] dealershipGetInfo = input.split("\\|");
        String name = dealershipGetInfo[0];
        String address = dealershipGetInfo[1];
        String phoneNumber = dealershipGetInfo[2];
        System.out.println("Here is your dealership info: " + "\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone number: " + phoneNumber);
        System.out.println("Is this the correct dealership? (Y/N)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")){

        }

        return name + address + phoneNumber;

    }

    public void saveDealership(Dealership dealership) {
        System.out.println("Would you like to save this dealership's inventory? (Y/N)");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("Y")) {

        }
    }
}