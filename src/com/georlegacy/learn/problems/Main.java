package com.georlegacy.learn.problems;

/*
 * Listing all multiples of 3 and 5 below 1000 and finding the sum of them
 *
 *  @author James Conway
 */


public class Main {

    public static void main(String[] args) {
        // Total sum which we can add to
        int total = 0;

        // Looping through 0 through 1000
        for (int i = 0; i <= 1000; i++) {
            // Using modulus operator to confirm remainder is 0 when diving by 3 or 5 to check
            // whether the number is a multiple or not
            if ((i % 3 == 0) || (i % 5 == 0)) {
                // Adding the number to our total if it is a multiple of 3 or 5
                total += i;
            }
        }

        // Print the sum to the console
        System.out.printf("Total sum of multiples of 3 and 5 below 1000 is %s", total);
    }

}
