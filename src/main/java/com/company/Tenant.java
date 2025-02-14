package com.company;

public class Tenant {
    private String name;
    private int floorNumber;
    private double monthlyRent;
    private String apartmentNumber;

    public Tenant(String name, int floorNumber, double monthlyRent, String apartmentNumber) {
        this.name = name;
        this.floorNumber = floorNumber;
        this.monthlyRent = monthlyRent;
        this.apartmentNumber = apartmentNumber;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getFloorNumber() { return floorNumber; }
    public void setFloorNumber(int floorNumber) { this.floorNumber = floorNumber; }
    
    public double getMonthlyRent() { return monthlyRent; }
    public void setMonthlyRent(double monthlyRent) { this.monthlyRent = monthlyRent; }
    
    public String getApartmentNumber() { return apartmentNumber; }
    public void setApartmentNumber(String apartmentNumber) { this.apartmentNumber = apartmentNumber; }

    @Override
    public String toString() {
        return "Tenant: " + name + ", Floor: " + floorNumber + ", Apt: " + apartmentNumber;
    }
}
