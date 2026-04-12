/**
 * TOPIC: Unbounded Generics & Object Equality
 * CONCEPTS: Generic Array Handling, .equals() vs ==, and Wrapper Classes.
 * GOAL: Create a single class that can perform operations (like counting 
 * occurrences) on an array of ANY object type.
 */

import java.util.*;

// <T> is an "Unbounded Type Parameter". 
// Since it doesn't 'extend' anything, T can be absolutely any Object.
class ArrayExample <T> {
    T[] a;
    
    public ArrayExample(T[] arr) {
        // Shifting the reference of the array to our internal variable 'a'
        a = arr;
    }

    public void display() {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * THE ELEMENT COUNT METHOD:
     * This is the "brain" of the class. It works for Integers, 
     * Strings, or even custom Employee objects.
     */
    public int elementCount(T x) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            // IMPORTANT: We use .equals() because '==' compares memory addresses.
            // .equals() compares the actual content (the value of the number or string).
            if(a[i].equals(x)) {
                count = count + 1;
            }
        }
        return count; 
    } 
}

public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // --- INTEGER SECTION ---
        int len = sc.nextInt(); 
        Integer[] x = new Integer[len]; // Using Wrapper class 'Integer' instead of 'int'
        for(int i = 0; i < len; i++) {
            x[i] = sc.nextInt(); 
        }
        ArrayExample<Integer> obj = new ArrayExample<Integer>(x);
        int s1 = sc.nextInt(); // The integer to search for
        
        // --- STRING SECTION ---
        String[] y = new String[len];
        for(int i = 0; i < len; i++) {
            y[i] = sc.next(); 
        }
        ArrayExample<String> obj1 = new ArrayExample<String>(y);
        String s2 = sc.next(); // The string to search for

        // Output results
        obj.display();
        System.out.println(obj.elementCount(s1));
        
        obj1.display();
        System.out.println(obj1.elementCount(s2));
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. WHY WRAPPER CLASSES?
     Generics in Java **do not work with primitives** (int, double, char). 
     They only work with Objects. That is why we use `Integer[]` instead 
     of `int[]`. Java automatically converts `int` to `Integer` 
     (this is called Autoboxing).

  2. THE .equals() METHOD:
     Every class in Java inherits from the `Object` class, which has the 
     `.equals()` method. By using `a[i].equals(x)`, the program correctly 
     compares the "value" regardless of whether T is a String or an Integer.

  

  3. CODE REUSABILITY:
     Notice how we didn't have to write one class for `IntegerArray` and 
     another for `StringArray`. The `ArrayExample<T>` class is a template 
     that handles both, reducing code duplication.

  4. EXPECTED OUTPUT (If input is: 3, 1 2 1, 1, apple banana apple, apple):
     1 2 1 
     2
     apple banana apple 
     2

  5. WHY?
     - In the first object (Integer), '1' appears twice.
     - In the second object (String), 'apple' appears twice.
     - The `.equals()` logic correctly identifies these matches.
  --------------------------------------------------
*/