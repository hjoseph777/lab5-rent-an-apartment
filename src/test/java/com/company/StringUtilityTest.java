package com.company;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilityTest {
    @Test
    public void testCapitalize() {
        assertEquals("Hello", StringUtility.capitalize("hello"));
        assertEquals("Hello", StringUtility.capitalize("HELLO"));
        assertEquals("Hello", StringUtility.capitalize("hElLo"));
        assertEquals("", StringUtility.capitalize(""));
        assertNull(StringUtility.capitalize(null));
    }

    @Test
    public void testFormatCurrency() {
        assertEquals("$500.00", StringUtility.formatCurrency(500));
        assertEquals("$650.50", StringUtility.formatCurrency(650.50));
        assertEquals("$0.00", StringUtility.formatCurrency(0));
    }

    @Test
    public void testPadding() {
        assertEquals("  hello", StringUtility.padLeft("hello", 7));
        assertEquals("hello  ", StringUtility.padRight("hello", 7));
        assertEquals("hello", StringUtility.padLeft("hello", 5));
        assertEquals("hello", StringUtility.padRight("hello", 5));
    }
}
