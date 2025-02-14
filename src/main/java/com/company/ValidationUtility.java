package com.company;

import java.util.Scanner;


// takes a String as a parameter and returns a modified version of it
// validation of inputs
public class ValidationUtility {
    
    public static String getValidName(Scanner scanner) {
        while (true) {
            System.out.print("Enter name: ");
            String rawName = scanner.nextLine().trim();
            
            if (rawName.isEmpty()) {
                System.out.println("Error: Name cannot be empty");
                continue;
            }
            
            if (!rawName.matches("[a-zA-Z ]+")) {
                System.out.println("Error: Name can only contain letters and spaces");
                continue;
            }

            return formatName(rawName);
        }
    }

    public static int getValidFloor(Scanner scanner) {
        while (true) {
            System.out.print("Enter floor (1-5): ");
            String input = scanner.nextLine().trim();
            try {
                int floor = Integer.parseInt(input);
                if (floor >= 1 && floor <= 5) {
                    return floor;
                }
                System.out.println("Error: Floor must be between 1 and 5");
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a whole number");
            }
        }
    }

    private static String formatName(String rawName) {
        String[] nameParts = rawName.split(" ");
        StringBuilder formattedName = new StringBuilder();
        for (String part : nameParts) {
            if (formattedName.length() > 0) {
                formattedName.append(" ");
            }
            formattedName.append(StringUtility.capitalize(part));
        }
        return formattedName.toString();
    }
}
