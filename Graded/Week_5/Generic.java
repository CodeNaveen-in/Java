/**
 * TOPIC: Java Generics & Type Bounding
 * CONCEPTS: Generic Classes <T>, Bounded Types (extends Number), 
 * Wildcards (?), and Auto-unboxing.
 */

import java.util.*;

// 'T extends Number' means this class only works with numeric types 
// (Integer, Double, Float, etc.). It prevents someone from making a 
// ComplexNum<String>.
class ComplexNum<T extends Number> {
    private T r, i; // Real and Imaginary parts

    public ComplexNum(T r, T i) {
        this.r = r;
        this.i = i;
    }

    /**
     * THE GENERIC ADD METHOD:
     * ComplexNum<?> c uses a 'Wildcard'. This means 'c' can be a 
     * ComplexNumber of ANY type (Integer, Double, etc.).
     */
    public ComplexNum<Double> add(ComplexNum<?> c) {
        // We create a result object specifically of type Double
        ComplexNum<Double> dc = new ComplexNum<Double>(0.0, 0.0);
        
        // .doubleValue() is a method from the Number class. 
        // Since T extends Number, we are guaranteed that this method exists!
        dc.r = this.r.doubleValue() + c.r.doubleValue(); 
        dc.i = this.i.doubleValue() + c.i.doubleValue(); 
        
        return dc;
    }

    @Override
    public String toString() {
        // Standardizing the output to double format
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

class Generic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading different types of numbers
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        // c1 uses Integers, c2 uses Doubles. 
        // Generics allow the same class to handle both!
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);

        // The add method accepts c2 (Double) even though c1 is Integer 
        // because of the wildcard (?) in the method signature.
        ComplexNum<Double> c3 = c1.add(c2);

        // toString() is called automatically when printing the object
        System.out.println(c1 + " + " + c2 + " = " + c3);
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. BOUNDED TYPE PARAMETERS (<T extends Number>):
     This restricts the "Generic". If you tried to create `ComplexNum<Character>`, 
     the code wouldn't compile because Character does not extend Number.

  2. WILDCARDS (?):
     The `add(ComplexNum<?> c)` signature is very flexible. Without the `?`, 
     an `Integer` complex number wouldn't be able to add a `Double` complex 
     number because Java treats `ComplexNum<Integer>` and `ComplexNum<Double>` 
     as totally different types.

  

  3. TYPE ERASURE:
     Remember for your theory exam: Generics are a "compile-time" feature. 
     After the code is compiled, Java "erases" the types (T becomes Number) 
     to maintain backward compatibility with older Java versions.

  4. EXPECTED OUTPUT (If input: 1, 2, 3.5, 4.5):
     1.0 + 2.0i + 3.5 + 4.5i = 4.5 + 6.5i

  5. WHY?
     - 1 + 3.5 = 4.5 (Real part)
     - 2 + 4.5 = 6.5 (Imaginary part)
     - Everything is converted to .doubleValue() for the final output.
  --------------------------------------------------
*/