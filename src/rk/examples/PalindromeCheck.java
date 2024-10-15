package rk.examples;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        
        //originalString = originalString.replaceAll("\\s+", "").toLowerCase();

        // Create a reversed version of the input
        String reversedString = " ";

        // Reverse the original string
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i); 
        }

        // Check if the original string is equal to the reversed string
        if (originalString.equals(reversedString)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}