import java.util.*; // Imports utility classes including Scanner for user input

// Generic class to handle arrays of any type T
class ArrayExample<T> {
  T[] a; // Array of type T

  // Constructor to initialize the array
  public ArrayExample(T[] arr) {
    a = arr;
  }

  // Method to display all elements in the array
  public void display() {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " "); // Prints each element followed by a space
    }
    System.out.println(); // Moves to the next line after printing all elements
  }

  // Method to count how many times a specific element appears in the array
  public int elementCount(T x) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i].equals(x)) { // Checks if current element equals x
        count = count + 1;  // Increments count if match found
      }
    }
    return count; // Returns total count of matching elements
  }
}

// Main class to test the generic ArrayExample class
public class ArrayObject {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int len = sc.nextInt(); // Reads length of arrays

    // Reads Integer array input
    Integer[] x = new Integer[len];
    for (int i = 0; i < len; i++) {
      x[i] = sc.nextInt();
    }

    // Creates ArrayExample object for Integer array
    ArrayExample<Integer> obj = new ArrayExample<Integer>(x);

    int s1 = sc.nextInt(); // Reads Integer value to count in the array

    // Reads String array input
    String[] y = new String[len];
    for (int i = 0; i < len; i++) {
      y[i] = sc.next(); // Reads each string element
    }

    // Creates ArrayExample object for String array
    ArrayExample<String> obj1 = new ArrayExample<String>(y);

    String s2 = sc.next(); // Reads String value to count in the array

    // Displays Integer array and counts occurrences of s1
    obj.display();
    System.out.println(obj.elementCount(s1));

    // Displays String array and counts occurrences of s2
    obj1.display();
    System.out.println(obj1.elementCount(s2));
  }
}
