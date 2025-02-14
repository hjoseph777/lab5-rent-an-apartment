package com.company;

public class StringUtility {
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String formatCurrency(double amount) {
        return String.format("$%.2f", amount);
    }

    public static String padLeft(String str, int length) {
        return String.format("%" + length + "s", str);
    }

    public static String padRight(String str, int length) {
        return String.format("%-" + length + "s", str);
    }
}
