package rk.examples;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of terms
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        
        // Variables to store the first two Fibonacci numbers
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to print the Fibonacci sequence
        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");
            
            // Update the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}