# Write a Java code that takes as input a positive number (length of an array here), and two arrays of that length - one of integers and another of strings. The code must also take an integer and a String as input, and print the number of occurrences of the integer and the string in the integer array and the string array, respectively.

## Format of input:
Length of the arrays
Elements in the integer array (in separate lines)
Element to count in the integer array
Elements in the string array (in separate lines)
Element to count in the string array

## Variables used in the code: 
len - represents length of array
s1 - represents an element to be counted for in Integer array 
s2 - represents an element to be counted for in String array 

## Key Concepts Illustrated:
- Generics: ArrayExample<T> works with any type (Integer, String, etc.).
- Type Safety: Ensures operations like .equals() are valid for the type.
- Encapsulation: Array operations are wrapped inside a reusable class.
- Polymorphism: Same methods (display, elementCount) work for different types.
