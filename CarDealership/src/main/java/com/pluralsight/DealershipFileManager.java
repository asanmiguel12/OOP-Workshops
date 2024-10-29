package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealershipFileManager {
    Scanner scanner = new Scanner(System.in);


    public String getDealership() throws IOException {
        FileReader fileReader = new FileReader("carInventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String dealershipInfo = bufferedReader.readLine();
        String[] dealershipGetInfo = dealershipInfo.split("\\|");
        String name = dealershipGetInfo[0];
        String address = dealershipGetInfo[1];
        String phoneNumber = dealershipGetInfo[2];

        System.out.println("Dealership info: " + "\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone number: " + phoneNumber);
        System.out.println("Is this the correct dealership you would like to view? (Y/N)");
        String choice = scanner.nextLine();

        bufferedReader.close();
        fileReader.close();


        if (choice.equalsIgnoreCase("Y")) {
            UserInterface userInterface = new UserInterface();
            userInterface.display();
        }
        if (choice.equalsIgnoreCase("N")) {
            userChooseDealership();
        }
        return dealershipInfo;
    }

    public void saveDealership(Dealership dealership) {
        System.out.println("Would you like to save this dealership's inventory? (Y/N)");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("Y")) {

        }
    }

    public void userChooseDealership() throws IOException {
        try {
            System.out.println("Please enter the name of the dealership you would like to view");
            String userInputFile = scanner.nextLine();
            FileReader fileReader = new FileReader(userInputFile + ".csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input = bufferedReader.readLine();

            if (input.contains(userInputFile)) {
                getDealership();
            } else {
                System.out.println("Sorry we could not find a dealership under that name. Please try again");
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Invalid Input" + "\n" + "Please Try Again");
            e.printStackTrace();

        }
    }

    public static String getInventory() throws IOException {
        FileReader fileReader = new FileReader("carInventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Vehicle> inventory = new ArrayList<>();

        String readLine1 = bufferedReader.readLine();
        System.out.println(readLine1);

        String readLine;
        while ((readLine = bufferedReader.readLine()) != null) {
            String[] vehicleInfo = readLine.split("\\|");
            Vehicle vehicle = new Vehicle(vehicleInfo[0], Integer.parseInt(vehicleInfo[1]), vehicleInfo[2], vehicleInfo[3], vehicleInfo[4], vehicleInfo[5], vehicleInfo[6], Double.parseDouble(vehicleInfo[7]));
            inventory.add(vehicle);
            System.out.println(readLine);
        }
        return inventory.toString();
    }

}
