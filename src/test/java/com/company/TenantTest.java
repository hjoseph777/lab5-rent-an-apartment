package com.company;

import static org.junit.Assert.*;
import org.junit.Test;

public class TenantTest {
    @Test
    public void testTenantGettersAndSetters() {
        Tenant tenant = new Tenant("John Doe", 2, 650.00, "201");
        
        assertEquals("John Doe", tenant.getName());
        assertEquals(2, tenant.getFloorNumber());
        assertEquals(650.00, tenant.getMonthlyRent(), 0.01);
        assertEquals("201", tenant.getApartmentNumber());

        // Test setters
        tenant.setName("Jane Doe");
        tenant.setFloorNumber(3);
        tenant.setMonthlyRent(800.00);
        tenant.setApartmentNumber("301");

        assertEquals("Jane Doe", tenant.getName());
        assertEquals(3, tenant.getFloorNumber());
        assertEquals(800.00, tenant.getMonthlyRent(), 0.01);
        assertEquals("301", tenant.getApartmentNumber());
    }

    @Test
    public void testTenantToString() {
        Tenant tenant = new Tenant("John Doe", 2, 650.00, "201");
        String expected = "Tenant: John Doe, Floor: 2, Apt: 201";
        assertEquals(expected, tenant.toString());
    }
}
