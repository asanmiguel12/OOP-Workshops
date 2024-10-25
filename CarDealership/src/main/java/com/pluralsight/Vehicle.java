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

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
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
