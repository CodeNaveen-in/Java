/**
 * TOPIC: Exception Chaining
 * CONCEPTS: Chained Exceptions (initCause/getCause), Wrapping Exceptions, 
 * and Rethrowing.
 * GOAL: Convert a technical error (ArrayIndexOutOfBounds) into a 
 * user-friendly one (InvalidInputEx) without losing the original error info.
 */

import java.util.*;

// 1. CUSTOM EXCEPTION
class InvalidInputEx extends Exception {
    public InvalidInputEx(String msg) {
        // super(msg) passes the error message to the base Exception class
        super(msg);
    }
}

class IntList {
    private int[] i_arr = new int[5]; // Fixed size of 5

    public void set_value(int i, int v) throws InvalidInputEx {
        try {
            i_arr[i] = v;
        } catch (ArrayIndexOutOfBoundsException e1) {
            // 2. EXCEPTION CHAINING
            // We create our custom exception
            InvalidInputEx e2 = new InvalidInputEx("invalid index input");
            
            // initCause(e1) "links" the original technical error (e1) 
            // to our custom error (e2).
            e2.initCause(e1);
            
            // Throw the new "wrapped" exception
            throw e2;
        }
    }

    public int[] getArray() {
        return i_arr;
    }
}

class ExceptionChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntList ilist = new IntList();
        
        try {
            // Loop runs 5 times, taking (Index, Value) pairs
            for(int i = 0; i < 5; i++) {			
                int n = sc.nextInt(); // Index
                int m = sc.nextInt(); // Value
                ilist.set_value(n, m);
            }
        } catch(InvalidInputEx e) {
            // 3. UNWRAPPING THE EXCEPTION
            // Prints our custom message
            System.out.println(e.getMessage()); 
            
            // getCause() retrieves the original ArrayIndexOutOfBoundsException
            Throwable ori = e.getCause();
            System.out.println(ori.getMessage());
        }	

        // Printing the array after the operations
        int[] i_arr = ilist.getArray();
        for(int val : i_arr) {
            System.out.print(val + " ");
        }
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. WHY CHAIN EXCEPTIONS? 
     It allows you to provide a meaningful error message to the user 
     (e.g., "invalid index input") while still preserving the technical 
     root cause for the developer to fix (e.g., Index 10 out of bounds).

  

  2. KEY METHODS:
     - initCause(Throwable): Used to set the original cause of the exception.
     - getCause(): Used to retrieve the original cause.
     - Throwable: The superclass of all errors and exceptions in Java.

  3. PROGRAM FLOW:
     - If the user enters index 10 (which is > 4), `i_arr[10]` fails.
     - Java throws `ArrayIndexOutOfBoundsException`.
     - The `catch` block in `set_value` catches it and creates an `InvalidInputEx`.
     - It links the two and sends the `InvalidInputEx` up to the `main` method.

  4. EXPECTED OUTPUT (If input: 10 50):
     invalid index input
     Index 10 out of bounds for length 5
     0 0 0 0 0 

  5. WHY?
     - The first line is our custom message.
     - The second line is the message from the original `ori` (ArrayIndexOutOfBounds).
     - The array is all 0s because the program stopped at the first error 
       before any values were successfully set.
  --------------------------------------------------
*/