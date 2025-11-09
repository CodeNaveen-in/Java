import java.util.*; // Imports utility classes including Scanner for user input

// Generic class to represent a complex number
class ComplexNum<T extends Number> {
    private T r, i; // 'r' is the real part, 'i' is the imaginary part

    // Constructor to initialize the complex number
    public ComplexNum(T r, T i) {
        this.r = r;
        this.i = i;
    }

    // Method to add this complex number with another, returning a ComplexNum<Double>
    public ComplexNum<Double> add(ComplexNum<?> c) {
        // Create a new ComplexNum<Double> initialized to 0 + 0i
        ComplexNum<Double> dc = new ComplexNum<Double>(0.0, 0.0);

        // Add real parts and imaginary parts after converting to double
        dc.r = this.r.doubleValue() + c.r.doubleValue();
        dc.i = this.i.doubleValue() + c.i.doubleValue();

        return dc; // Return the result
    }

    // Override toString() to display the complex number in readable format
    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

// Main class to test the ComplexNum functionality
class FClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for reading input

        int n1, n2;        // Integer parts for first complex number
        double d1, d2;     // Double parts for second complex number

        // Read integer values
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        // Read double values
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        // Create complex number with integer values
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);

        // Create complex number with double values
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);

        // Add the two complex numbers
        ComplexNum<Double> c3 = c1.add(c2);

        // Print the result in readable format
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
