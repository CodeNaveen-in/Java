import java.util.*; // Imports utility classes including Scanner for user input

// Abstract base class defining string operations
abstract class StringOperations {
  public abstract String reverse(String s);     // Abstract method to reverse a string
  public abstract int vowelCount(String s);     // Abstract method to count vowels in a string
}

// Abstract class that partially implements StringOperations
abstract class StringReverse extends StringOperations {
  // Implements the reverse method
  public String reverse(String s) {
    String s1 = ""; // Initialize an empty string to hold the reversed result
    for (int i = s.length() - 1; i >= 0; i--) {
      s1 = s1 + s.charAt(i); // Append characters in reverse order
    }
    return s1; // Return the reversed string
  }
}

// Concrete class that completes the implementation of StringOperations
class UpdatedStrings extends StringReverse {
  // Implements the vowelCount method
  public int vowelCount(String s) {
    int count = 0; // Initialize vowel count
    char[] arr = {'a', 'e', 'i', 'o', 'u'}; // Array of lowercase vowels

    // Loop through each character in the input string
    for (int i = 0; i < s.length(); i++) {
      // Check if the character matches any vowel
      for (int j = 0; j < arr.length; j++) {
        if (s.charAt(i) == arr[j]) {
          count = count + 1; // Increment count if vowel is found
        }
      }
    }
    return count; // Return total number of vowels
  }
}

// Main class to run the program
class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object for input
    String s = sc.next(); // Read a single word from user input

    UpdatedStrings str = new UpdatedStrings(); // Create object of UpdatedStrings

    // Print reversed string
    System.out.println("Reverse of " + s + " is " + str.reverse(s));

    // Print vowel count
    System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
  }
}
