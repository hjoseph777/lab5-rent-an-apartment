package com.company;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Rent rentManager = new Rent();
        Scanner scanner = new Scanner(System.in);

        // Get validated input using ValidationUtility
        String name = ValidationUtility.getValidName(scanner);
        int floor = ValidationUtility.getValidFloor(scanner);

        try {
            double rent = rentManager.calculateRentByFloor(floor);
            rentManager.addTenant(name, floor);

            System.out.println("\nHi " + name + ", the rent for floor number " + floor);
            System.out.printf("rent = $%.2f total per month%n", rent);

            rentManager.displayTenants();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
