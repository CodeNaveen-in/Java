/**
 * TOPIC: Polymorphism & Type Checking
 * CONCEPTS: Method Overriding, 'instanceof' operator, and Dynamic Dispatch.
 * USE CASE: Using a single method ('caller') to process different subclasses of 'Shape'.
 */

import java.util.*;

class Shape {
    // Base methods - these act as "placeholders"
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape {
    private int w, h;

    public Rectangle(int w_, int h_) {
        w = w_;
        h = h_;
    }

    // Overriding the area method for a 2D shape
    @Override
    public int area() {
        return w * h;
    }
    
    // Note: Rectangle uses the default volume() from Shape (returns 0)
}

class Cube extends Shape {
    private int a;

    public Cube(int a_) {
        a = a_;
    }

    // Overriding area for a 3D shape (Surface Area)
    @Override
    public int area() {
        return 6 * a * a;
    }

    // Overriding volume for a 3D shape
    @Override
    public int volume() {
        return a * a * a;
    }
}

public class MethodOverriding {
    /**
     * The 'caller' method accepts ANY Shape.
     * This is a "Polymorphic Parameter".
     */
    private static void caller(Shape s) {
        // 'instanceof' checks the actual type of the object at runtime
        if (s instanceof Rectangle) {
            // If it's a Rectangle, we print its area
            System.out.println("Rectangle Area: " + s.area());
        }
        
        if (s instanceof Cube) {
            // If it's a Cube, we print its volume
            System.out.println("Cube Volume: " + s.volume());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt(); // Width for Rectangle
        int h = sc.nextInt(); // Height for Rectangle
        int a = sc.nextInt(); // Side for Cube

        // Creating objects and passing them to the polymorphic method
        caller(new Rectangle(w, h));
        caller(new Cube(a));
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. THE 'instanceof' OPERATOR:
     This is a comparison operator used to check if an object is an instance 
     of a specific class or an interface. It returns true or false. 
     In the `caller` method, it prevents us from trying to calculate 
     volume for a Rectangle if it wasn't designed for it.

  2. POLYMORPHIC PARAMETERS:
     The method `caller(Shape s)` is very flexible. It doesn't care if you 
     pass a Rectangle, a Cube, or a Circle (if one existed). As long as 
     the class "is-a" Shape, it works.

  

  3. METHOD OVERRIDING:
     Even though `s` is treated as a `Shape` in the `caller` method, 
     when `s.area()` is called, Java looks at the *actual* object. 
     If it's a Cube, it runs the Cube's area logic. If it's a Rectangle, 
     it runs the Rectangle's logic.

  4. EXPECTED OUTPUT (If input: 5, 4, 3):
     20
     27

  5. WHY?
     - For the first call: Rectangle(5, 4) is passed. `instanceof Rectangle` is true. 
       5 * 4 = 20.
     - For the second call: Cube(3) is passed. `instanceof Cube` is true. 
       Volume of Cube = 3 * 3 * 3 = 27.
  --------------------------------------------------
*/