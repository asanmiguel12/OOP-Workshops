package com.pluralsight;

import java.io.IOException;
import java.util.*;

public class Dealership {
    String name;
    String address;
    String phone;
    ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();

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

    public List<Vehicle> getVehicleByPrice(double min, double max) throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        DealershipFileManager.getInventory();
        List<Vehicle> inventory = new ArrayList<>();
        for(Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                inventory.add(vehicle);
            }
        }
        return inventory;
    }

    public List<Vehicle> getVehicleByMakeModel(String make, String model) throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        DealershipFileManager.getInventory();
        List<Vehicle> inventory = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(vehicle.make) && vehicle.getModel().equalsIgnoreCase(model)) {
                inventory.add(vehicle);
            }
        }
        return inventory;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        DealershipFileManager.getInventory();
        return getAllVehicles();
    }

    public List<Vehicle> getVehicleByColor(String color) throws IOException {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        DealershipFileManager dealershipFileManager = new DealershipFileManager();

        DealershipFileManager.getInventory();
        return inventory;

    }

    public List<Vehicle> getVehicleByMileage(int min, int max) {
        return getVehicleByMileage(5, max);
    }

    public List<Vehicle> getVehicleByType() {
        return inventory;
    }

    public List<Vehicle> getAllVehicles() {
        try {
            DealershipFileManager dealershipFileManager = new DealershipFileManager();
            DealershipFileManager.getInventory();
            ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inventory;
    }

    public void addVehicle(Vehicle vehicle) throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.getInventory();
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.getInventory();
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        inventory.remove(vehicle);
    }
}
