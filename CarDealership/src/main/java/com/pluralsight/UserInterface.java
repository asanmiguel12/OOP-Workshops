package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
Scanner scanner = new Scanner(System.in);

    private Dealership dealership(Dealership dealership) {
        return dealership;
    }

    public void display() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        Dealership dealership = new Dealership();
        try {
            System.out.println("Welcome To The Dealership Inventory Archives");

            System.out.println("How would you like to search this inventory?" + "\n" +
                    "1) Vehicles By Price" + "\n" +
                    "2) Vehicles By Model" + "\n" +
                    "3) Vehicles By Color" + "\n" +
                    "4) Vehicles By Mileage" + "\n" +
                    "5) Vehicles By Year" + "\n" +
                    "6) All Vehicles" + "\n" +
                    "7) Add Vehicle To Inventory" + "\n" +
                    "8) Remove Vehicle From Inventory ");

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    dealershipFileManager.getDealership();
                    dealership.getVehicleByPrice(600, 7000);
                    break;
                case 2:


            }


        } catch (Exception e) {
            System.out.println("Invalid Input" + "\n" +"Please Try Again");
           e.printStackTrace();
        }
    }

private ArrayList<Vehicle> displayVehicles() {
    return displayVehicles();
}

public ArrayList<Vehicle> processAllVehicles (){
    return processAllVehicles();
}
public void addVehicle(){
    System.out.println("Do you want to add a vehicle to this inventory?");

}
public void removeVehicle(){
    System.out.println("Do you want to add a vehicle to this inventory?");


}
}
