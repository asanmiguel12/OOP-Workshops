package com.pluralsight;

public class Vehicle {
    String brand;
    String carType;
    int yearMake;
    String model;
    String id;
    String color;
    String odometer;
    double price;

    public Vehicle(String id, int yearMake, String brand, String model,
                   String carType, String color, String odometer, double price) {
        this.brand = brand;
        this.carType = carType;
        this.yearMake = yearMake;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getYearMake() {
        return yearMake;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

