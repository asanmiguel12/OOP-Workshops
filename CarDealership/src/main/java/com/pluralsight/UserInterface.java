package com.pluralsight;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
Scanner scanner = new Scanner(System.in);

    private void init() throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        Dealership dealership = new Dealership();
    }

    public void display() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        Dealership dealership = new Dealership();
        try {
            System.out.println("Welcome To The Dealership Inventory Archives");

            System.out.println("How would you like to search this inventory?" + "\n" +
                    "1) Vehicles By Price" + "\n" +
                    "2) Vehicles By Make and Model" + "\n" +
                    "3) Vehicles By Color" + "\n" +
                    "4) Vehicles By Mileage" + "\n" +
                    "5) Vehicles By Year" + "\n" +
                    "6) Vehicles By Type" + "\n" +
                    "6) All Vehicles" + "\n" +
                    "7) Add Vehicle To Inventory" + "\n" +
                    "8) Remove Vehicle From Inventory ");

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    dealershipFileManager.getDealership();
                    processGetByPriceRequest();
                    break;
                case 2:
                    dealershipFileManager.getDealership();
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    dealershipFileManager.getDealership();
                    processGetByColorRequest();
                    break;
                case 4:
                    dealershipFileManager.getDealership();
                    processGetByMileageRequest();
                    break;
                case 5:
                    dealershipFileManager.getDealership();
                    processGetAllVehiclesRequest();
                    break;
                case 6:
                    dealershipFileManager.getDealership();
                    processGetAllVehiclesRequest();
                    break;
                case 7:
                    dealershipFileManager.getDealership();
                    dealership.getAllVehicles();
                    break;
                case 8:
                    dealershipFileManager.getDealership();
                    processAddVehicleRequest();
                    break;
                case 9:
                    dealershipFileManager.getDealership();
                    processRemoveVehicleRequest();
                    break;



            }
            System.out.println("Enter any input to continue");
            String buffer = scanner.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

private void processGetByPriceRequest() throws IOException {
    System.out.println("Enter the minimum price to search for:");
    double min = scanner.nextDouble();
    System.out.println("Enter the maximum price to search for:");
    double max = scanner.nextDouble();
    scanner.nextLine();
    Dealership dealership = new Dealership();

    List<Vehicle> filteredByPrice = dealership.getVehicleByPrice(min, max);
    displayVehicles(filteredByPrice);
        }

private void processGetByMakeModelRequest() throws IOException {
    System.out.println("Enter the make of the car:");
    String make = scanner.nextLine();
    System.out.println("Enter the model of the car");
    String model = scanner.nextLine();


    Dealership dealership = new Dealership();
    List<Vehicle> filteredByMakeModel = dealership.getVehicleByMakeModel(make, model);
    displayVehicles(filteredByMakeModel);
        }

private void processGetByYearRequest() throws IOException {
    System.out.println("Enter the start year to search for:");
    int min = scanner.nextInt();
    System.out.println("Enter the end year to search for:");
    int max = scanner.nextInt();
    scanner.nextLine();
    Dealership dealership = new Dealership();

    List<Vehicle> filteredByYear = dealership.getVehicleByYear(min, max);
    displayVehicles(filteredByYear);
}

        private void processGetByColorRequest() throws IOException {
            System.out.println("Enter the color to search for:");
            String color = scanner.nextLine();
            Dealership dealership = new Dealership();

            List<Vehicle> filteredByColor = dealership.getVehicleByColor(color);
            displayVehicles(filteredByColor);
        }

        private void processGetByMileageRequest() {
            System.out.println("Enter the minimum mileage to search for:");
            int min = scanner.nextInt();
            System.out.println("Enter the maximum mileage to search for:");
            int max = scanner.nextInt();
            scanner.nextLine();
            Dealership dealership = new Dealership();
            List<Vehicle> filteredByMileage = dealership.getVehicleByMileage(min, max);
            displayVehicles(filteredByMileage);
        }

        private void processGetByVehicleTypeRequest() {
            System.out.println("Enter the vehicle type to search for:");
            String type = scanner.nextLine();
            Dealership dealership = new Dealership();

            List<Vehicle> filteredByType = dealership.getVehicleByType();
            displayVehicles(filteredByType);
        }

        public void processGetAllVehiclesRequest() {
        Dealership dealership = new Dealership();
            List<Vehicle> allVehicles = dealership.getAllVehicles();
            displayVehicles(allVehicles);
        }

        private void processAddVehicleRequest() throws IOException {
            System.out.println("Enter the vin of the car:");
            String vin = scanner.nextLine();
            System.out.println("Enter the year of the car:");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the make of the car:");
            String brand = scanner.nextLine();
            System.out.println("Enter the model of the car:");
            String make = scanner.nextLine();
            System.out.println("Enter the type of the car:");
            String model = scanner.nextLine();
            System.out.println("Enter the color of the car:");
            String color = scanner.nextLine();
            System.out.println("Enter the mileage of the car:");
            String odometer = scanner.nextLine();
            System.out.println("Enter the price of the car:");
            double price = scanner.nextDouble();
            scanner.nextLine();


            Dealership dealership = new Dealership();
            Vehicle vehicle = new Vehicle(vin, year, brand, make, model, color, odometer, price);
            dealership.addVehicle(vehicle);
        }

        private void processRemoveVehicleRequest() throws IOException {
            System.out.println("Enter the VIN of the vehicle you want to remove");
            String vin = scanner.nextLine();
            scanner.nextLine();
            Vehicle toRemove = null;
            Dealership dealership = new Dealership();
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                if (vehicle.getVin().equals(vin)) {
                    toRemove = vehicle;
                }
            }
            if (toRemove != null) {
                dealership.removeVehicle(toRemove);
            }
        }

        private void displayVehicles(List<Vehicle> vehicles) {
            for (Vehicle vehicle : vehicles) {
                System.out.println("VIN: " + vehicle.getVin() + " Year: " + vehicle.getYearMake() + " Make: " +
                        vehicle.getMake() + " Model: " + vehicle.getModel() + " Type: " + vehicle.getModel() +
                        " Color: " + vehicle.getColor() + " Odometer: " + vehicle.getOdometer() + " Price: " +
                        vehicle.getPrice());
        }
    }
}