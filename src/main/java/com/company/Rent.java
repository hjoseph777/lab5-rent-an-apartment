package com.company;

import java.util.ArrayList;
import java.util.List;

public class Rent {
    private List<Tenant> tenants;
    private double[] floorRents;
    
    public Rent() {
        tenants = new ArrayList<>();
        floorRents = new double[]{500, 650, 800, 950, 1100};
    }

    public double calculateRentByFloor(int floor) {
        if (floor < 1 || floor > 5) {
            throw new IllegalArgumentException("Floor must be between 1 and 5");
        }
        return floorRents[floor - 1];
    }

    public void addTenant(String name, int floor) {
        double rent = calculateRentByFloor(floor);
        String apartmentNumber = String.format("%d%02d", floor, tenants.size() + 1);
        Tenant tenant = new Tenant(name, floor, rent, apartmentNumber);
        tenants.add(tenant);
    }

    public void displayTenants() {
        System.out.println("\nCurrent Tenants:");
        System.out.println("----------------------------------------");
        for (Tenant tenant : tenants) {
            System.out.printf("Name: %-20s Floor: %d  Rent: $%.2f%n",
                tenant.getName(),
                tenant.getFloorNumber(),
                tenant.getMonthlyRent());
        }
        System.out.println("----------------------------------------");
    }

    public boolean removeTenant(String apartmentNumber) {
        return tenants.removeIf(t -> t.getApartmentNumber().equals(apartmentNumber));
    }

    public double getTotalMonthlyRent() {
        return tenants.stream()
                     .mapToDouble(Tenant::getMonthlyRent)
                     .sum();
    }

    public List<Tenant> getTenantsByFloor(int floor) {
        List<Tenant> floorTenants = new ArrayList<>();
        for (Tenant tenant : tenants) {
            if (tenant.getFloorNumber() == floor) {
                floorTenants.add(tenant);
            }
        }
        return floorTenants;
    }

    public List<Tenant> getAllTenants() {
        return new ArrayList<>(tenants);
    }
}
