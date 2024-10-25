package com.pluralsight;

public class Vehicle {
    String brand;
    String carType;
    int yearMake;
    int vin;
    String id;
    String color;
    String odometer;
    double price;

    public Vehicle(String brand, String carType, int yearMake, int vin,
                   String id, String color, String odometer, double price) {
        this.brand = brand;
        this.carType = carType;
        this.yearMake = yearMake;
        this.vin = vin;
        this.id = id;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
}
