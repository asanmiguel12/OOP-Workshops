package com.pluralsight;

import java.util.ArrayList;
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

    static List<Vehicle> getAllVehicles(){
        return getAllVehicles();
    }

    static Vehicle addVehicle(Vehicle vehicle){
        return addVehicle(vehicle);
    }

    static Vehicle removeVehicle (Vehicle vehicle) {
        return removeVehicle(vehicle);
    }
}