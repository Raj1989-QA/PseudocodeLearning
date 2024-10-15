package rk.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumbers {

    public static void main(String[] args) { 		

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 45,  235, 99, 12, 6));

    int max = numbers.get(0); // Loop through the list to find the maximum 

   for (int i = 1; i < numbers.size(); i++) {

	  if (numbers.get(i) > max) { 
		
		max = numbers.get(i);
		   } 
	   } 


	 System.out.println("The maximum number is: " + max); 
		    }
           } 
