import java.util.*; // Imports all classes from the java.util package, including Scanner for input

public class SeriesSum { // Declares a public class named SeriesSum
  public static void main(String[] args) { // Main method: entry point of the program
    Scanner sc = new Scanner(System.in); // Creates a Scanner object to read input from the user
    int n = sc.nextInt(); // Reads an integer input from the user and stores it in variable 'n'

    int sum = 0; // Initializes a variable 'sum' to store the cumulative total

    // Outer loop: runs from 1 to n (inclusive)
    for (int i = 1; i <= n; i++) {
      // Inner loop: runs from 1 to i (inclusive)
      for (int j = 1; j <= i; j++) {
        sum = sum + j * j; // Adds the square of 'j' to 'sum'
      }
    }

    System.out.println(sum); // Prints the final computed sum to the console
  }
}