/**
 * TOPIC: Abstract Classes & Partial Implementation
 * CONCEPTS: Abstract methods, Multilevel Inheritance, and String Manipulation.
 * GOAL: To show how an abstract class can "pass the buck" to its children 
 * until all methods are finally implemented.
 */

import java.util.*;

// LEVEL 1: The Blueprint
// Abstract classes cannot be instantiated (you can't do 'new StringOperations()')
abstract class StringOperations {
    public abstract String reverse(String s);
    public abstract int vowelCount(String s);
}

// LEVEL 2: Partial Implementation
// This class is still 'abstract' because it ONLY implements reverse().
// It doesn't know how to do vowelCount() yet, so it stays abstract.
abstract class StringReverse extends StringOperations {
    @Override
    public String reverse(String s) {
        String s1 = "";
        // Reversing the string using a backward for-loop
        for(int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }
}

// LEVEL 3: The Concrete Class
// This class is NOT abstract because it implements the final missing 
// piece: vowelCount(). Now we can finally create an object!
class UpdatedStrings extends StringReverse {
    @Override
    public int vowelCount(String s) {
        int count = 0;
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        // Nested loop to compare each character of string against the vowel array
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < arr.length; j++) {
                if(s.charAt(i) == arr[j]) {
                    count = count + 1; 
                }
            }
        }
        return count;
    }
}

class AbstractChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input (e.g., "java")
        String s = sc.next();
        
        // We create an object of the "Concrete" class
        UpdatedStrings str = new UpdatedStrings();
        
        // Calling methods implemented at different levels of the hierarchy
        System.out.println("Reverse of " + s + " is " + str.reverse(s));
        System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. ABSTRACT CLASSES:
     Think of `StringOperations` as a contract. It says, "Any class that 
     wants to be a StringOperator MUST have a reverse and a vowelCount method."

  2. THE HIERARCHY CHAIN:
     - `StringOperations` defines the rules.
     - `StringReverse` follows half the rules (implements reverse).
     - `UpdatedStrings` follows all the rules (implements vowelCount).
     Only a "Concrete" class (one with no abstract methods left) can be used 
     to create an object with the `new` keyword.

  

  3. STRING MANIPULATION:
     - `charAt(i)`: Retrieves the character at a specific index.
     - String Concatenation: `s1 = s1 + s.charAt(i)` is how this code builds 
       the reversed string character by character.

  4. EXPECTED OUTPUT (If input: "hello"):
     Reverse of hello is olleh
     Vowel count of hello is 2

  5. WHY?
     - `reverse` loops from index 4 down to 0 ('o', 'l', 'l', 'e', 'h').
     - `vowelCount` finds 'e' and 'o', so the count is 2.
  --------------------------------------------------
*/