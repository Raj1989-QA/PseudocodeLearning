package rk.examples;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Prime numbers must be greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Not prime if divisible by any number in this range
                    break; // No need to check further if a divisor is found
                }
            }
        }

        // Print the result
        if (isPrime == true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}