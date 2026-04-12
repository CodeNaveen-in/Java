/**
 * TOPIC: Custom Exception Handling
 * CONCEPTS: Inheriting from Exception class, 'throw' vs 'throws', 
 * and the try-catch block.
 * GOAL: Create a specific rule where dividing by the number 3 
 * is treated as a critical error.
 */

import java.util.*;

// 1. CREATING THE CUSTOM EXCEPTION
// By extending 'Exception', we tell Java that DivisionException 
// is a "Checked Exception" (must be handled or declared).
class DivisionException extends Exception {
    // Overriding toString() allows us to define the custom message 
    // that appears when the exception is printed.
    public String toString() {
        return "Division by 3 is not allowed";
    }
}

public class Test {
    /**
     * THE 'throws' KEYWORD:
     * This is a warning in the method signature. It tells anyone 
     * calling this method: "Be careful, I might throw a DivisionException!"
     */
    public static int divide(int a, int b) throws DivisionException {
        if (b == 3) {
            // THE 'throw' KEYWORD:
            // This actually "trips the alarm" and creates the error object.
            throw new DivisionException();
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 2. THE TRY-CATCH BLOCK
        // We 'try' the risky code. If an exception occurs, 
        // the 'catch' block acts as a safety net.
        try {
            int c = divide(x, y);
            System.out.println("Result: " + c);
        } 
        catch (DivisionException e) {
            // This prints the result of the toString() method in our custom class
            System.out.println(e);
        }
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. CUSTOM EXCEPTIONS:
     You create one by extending the `Exception` class. This allows your 
     program to handle specific "domain" errors that Java's standard 
     library doesn't know about.

  2. THROW vs. THROWS (Common Exam Question!):
     - 'throws' (with an 's'): Used in the method signature to declare 
       what exceptions a method might throw.
     - 'throw' (no 's'): Used inside the method body to actually throw 
       the exception object.

  

  3. CHECKED vs. UNCHECKED:
     Because we extended `Exception`, this is a **Checked Exception**. 
     If you call `divide(x, y)` without a try-catch block or a throws 
     declaration in `main`, the code will not compile.

  4. EXPECTED OUTPUT:
     Input: 10 2
     Output: 5
     
     Input: 10 3
     Output: Division by 3 is not allowed

  5. WHY?
     When the second input is 3, the `if(b == 3)` condition becomes true. 
     The program jumps out of the `divide` method immediately, skips the 
     `System.out.println(c)` line in `main`, and goes straight to the 
     `catch` block.
  --------------------------------------------------
*/