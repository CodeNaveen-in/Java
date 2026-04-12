/**
 * TOPIC: Nested Loops & Series Summation
 * PROBLEM: Calculate the sum of squares in a triangular series pattern.
 * PATTERN: If n=3, the sum is (1^2) + (1^2 + 2^2) + (1^2 + 2^2 + 3^2)
 */

import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        // Scanner is used to take input from the user (Standard Input)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); 
        
        int sum = 0;

        // OUTER LOOP: Controls how many terms we are adding (1 to n)
        for (int i = 1; i <= n; i++) {
            
            // INNER LOOP: Calculates the sum of squares up to the current 'i'
            for (int j = 1; j <= i; j++) {
                sum = sum + (j * j);
            }
        }

        // Final Result Output
        System.out.println("Final Sum: " + sum);
        
        sc.close(); // Good practice to close the scanner
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE "NOOB":
  
  1. THE LOGIC: 
     This program doesn't just calculate 1^2 + 2^2 + 3^2. 
     Because of the nested loop, it calculates a cumulative sum.
     - When i=1: Inner loop runs once (j=1). Sum adds 1^2.
     - When i=2: Inner loop runs twice (j=1, j=2). Sum adds 1^2 + 2^2.
     - When i=3: Inner loop runs thrice (j=1, j=2, j=3). Sum adds 1^2 + 2^2 + 3^2.

  2. IMPORTANT CONCEPTS:
     - Nested Loops: The inner loop (j) completes all its iterations 
       every single time the outer loop (i) increments once.
     - Time Complexity: This is O(n^2), meaning if n=10, the inner 
       addition happens roughly 55 times, not just 10.
     - Accumulator Pattern: The variable 'sum' keeps its value 
       between iterations, growing larger each time.

  3. TRACE TABLE (If n = 3):
     i | j | Calculation (sum + j*j) | New sum
     --|---|-------------------------|---------
     1 | 1 | 0 + 1*1                 | 1
     2 | 1 | 1 + 1*1                 | 2
     2 | 2 | 2 + 2*2                 | 6
     3 | 1 | 6 + 1*1                 | 7
     3 | 2 | 7 + 2*2                 | 11
     3 | 3 | 11 + 3*3                | 20

  4. EXPECTED OUTPUT (for n=3): 
     20
     
  5. WHY? 
     The math looks like this: (1) + (1+4) + (1+4+9) = 20.
  --------------------------------------------------
*/