package org.example.SBA2;

public class StringValidator {
    public static void validate(String str) throws InvalidStringException {
        if (str == null || str.isEmpty()) {
            throw new InvalidStringException("The string is invalid: it is either null or empty.");
        }
        // Additional validation logic can be added here
    }

    public static void main(String[] args) {
        try {
            // Example usage of the validate method
            validate("");
        } catch (InvalidStringException e) {
            // Handle the custom exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
