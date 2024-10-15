package rk.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Maxnumbers1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the user's numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Ask the user how many numbers they want to input
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        // Get the numbers from the user
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Assume the first number is the maximum
        int max = numbers.get(0);

        // Loop through the list to find the maximum
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        // Print the result
        System.out.println("The maximum number is: " + max);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}