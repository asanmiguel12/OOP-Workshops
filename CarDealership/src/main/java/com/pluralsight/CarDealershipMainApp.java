package com.pluralsight;

import java.io.IOException;

public class CarDealershipMainApp {
    public static void main(String[] args) throws IOException {
        Dealership dealership = new Dealership("A's", "123", "1234");
        System.out.println(dealership.getName());

        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.getDealership();


    }


    }

