import java.util.*; // Imports utility classes, including Scanner for user input

// Base class Shape with default implementations
class Shape {
    public int area() {
        return 0; // Default area method returns 0
    }

    public int volume() {
        return 0; // Default volume method returns 0
    }
}

// Rectangle class inherits from Shape
class Rectangle extends Shape {
    private int w, h; // Width and height of the rectangle

    // Constructor to initialize width and height
    public Rectangle(int w_, int h_) {
        w = w_;
        h = h_;
    }

    // Overrides area method to compute rectangle area
    public int area() {
        return w * h;
    }
}

// Cube class inherits from Shape
class Cube extends Shape {
    private int a; // Side length of the cube

    // Constructor to initialize side length
    public Cube(int a_) {
        a = a_;
    }

    // Overrides area method to compute surface area of the cube
    public int area() {
        return 6 * a * a;
    }

    // Overrides volume method to compute volume of the cube
    public int volume() {
        return a * a * a;
    }
}

// Main class
class FClass {
    // Static method that takes a Shape object and prints area or volume
    private static void caller(Shape s) {
        if (s instanceof Rectangle) // Checks if s is a Rectangle
            System.out.println(s.area()); // Prints area of rectangle
        if (s instanceof Cube) // Checks if s is a Cube
            System.out.println(s.volume()); // Prints volume of cube
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        int w = sc.nextInt(); // Read width of rectangle
        int h = sc.nextInt(); // Read height of rectangle
        int a = sc.nextInt(); // Read side length of cube

        caller(new Rectangle(w, h)); // Calls method with Rectangle object
        caller(new Cube(a)); // Calls method with Cube object
    }
}
