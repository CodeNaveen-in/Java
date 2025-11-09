# Create an abstract class StringOperations that has the following abstract methods:
    String reverse(String s)
    int vowelCount(String s)

Create StringReverse class that extends StringOperations class but defines only String reverse(String s) method. 
It reverses the string which is passed as parameter and returns the reversed string.

Create UpdatedStrings class that extends StringReverse class and defines int vowelCount(String s) method.  
It counts the vowels in the string which is passed as parameter and returns the count.

## Key Concepts Illustrated:
- Abstract Classes: StringOperations defines a contract; StringReverse partially implements it.
- Method Overriding: UpdatedStrings completes the implementation by overriding vowelCount.
- String Manipulation: Reversing and counting vowels manually using loops.
- Polymorphism: The object str uses inherited methods from abstract classes.

