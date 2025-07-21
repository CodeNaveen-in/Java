// A Java program to demonstrate 
// working of printf() in Java
public class print_Output {
  
    public static void main(String[] args) {
        int x = 100;
      
        // Printing a simple integer
        System.out.printf("Printing simple integer: x = %d%n", x);

        // Printing a floating-point 
        // number with precision
        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float n = 5.2f;

        // Formatting a float to 4 decimal places
        System.out.printf("Formatted to specific width: n = %.4f%n", n);

        n = 2324435.3f;

        // Right-aligning and formatting a 
        // float to 20-character width
        System.out.printf("Formatted to right margin: n = %20.4f%n", n);

        //Other type Prints
        System.out.print("By normal print "); // Next output in In same line
        System.out.println("By Print ln"); // Next output in next line
    }
}