package com.company;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

public class RentTest {
    private Rent rent;

    @Before
    public void setUp() {
        rent = new Rent();
    }

    @Test
    public void testCalculateRentByFloor() {
        assertEquals(500.00, rent.calculateRentByFloor(1), 0.01);
        assertEquals(650.00, rent.calculateRentByFloor(2), 0.01);
        assertEquals(800.00, rent.calculateRentByFloor(3), 0.01);
        assertEquals(950.00, rent.calculateRentByFloor(4), 0.01);
        assertEquals(1100.00, rent.calculateRentByFloor(5), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFloorNumber() {
        rent.calculateRentByFloor(6);
    }

    @Test
    public void testAddTenant() {
        rent.addTenant("John Doe", 2);
        List<Tenant> tenants = rent.getAllTenants();
        
        assertEquals(1, tenants.size());
        assertEquals("John Doe", tenants.get(0).getName());
        assertEquals(2, tenants.get(0).getFloorNumber());
        assertEquals(650.00, tenants.get(0).getMonthlyRent(), 0.01);
    }

    @Test
    public void testGetTenantsByFloor() {
        rent.addTenant("John Doe", 2);
        rent.addTenant("Jane Smith", 2);
        rent.addTenant("Bob Wilson", 3);

        List<Tenant> secondFloorTenants = rent.getTenantsByFloor(2);
        assertEquals(2, secondFloorTenants.size());
    }
}
