package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Dealership {
    String name;
    String address;
    String phone;

    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    //Overload
    public Dealership() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static List<Vehicle> getVehicleByPrice(List<Vehicle> inventory) {
        return inventory;
    }

    static List<Vehicle> getVehicleByMake(List<Vehicle> inventory) {
        return inventory;
    }

    static List<Vehicle> getVehicleByYear(List<Vehicle> inventory) {
        return inventory;
    }

    static List<Vehicle> getVehicleByColor(List<Vehicle> inventory) {
        return inventory;
    }

    static List<Vehicle> getVehicleByMileage(List<Vehicle> inventory) {
        return inventory;
    }

    static List<Vehicle> getVehicleByType(List<Vehicle> inventory) {
        return inventory;
    }

    static List<Vehicle> getAllVehicles() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        try {
            dealershipFileManager.getDealership();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } return getAllVehicles();
    }
    static Vehicle addVehicle(Vehicle vehicle){
        return addVehicle(vehicle);
    }

    static Vehicle removeVehicle (Vehicle vehicle) {
        return removeVehicle(vehicle);
    }
}