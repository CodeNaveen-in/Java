# Given as input two integers n_1,n_2 and two double values d_1,d_2 complete the Java code to form two complex numbers c_1 and c_2, as described below, and print their sum.
The real parts of c_1 and c_2 are n_1 and d_1 respectively, whereas their imaginary parts are n_2 and d_2, respectively.

## Define a generic class ComplexNum with the following members.
Instance variables r and i
A constructor to initialize r and i	
A method add()to return the sum of the two instances of generic type ComplexNum
A method that overrides the toString() method in the Object class so that the format of the output is in accordance with those in the test cases.

## Key Concepts Illustrated:
- Generics with bounded types: T extends Number allows use of numeric types like Integer, Double, etc.
- Wildcard usage: ComplexNum<?> enables adding any numeric complex number.
- Type conversion: doubleValue() ensures consistent arithmetic.
- Polymorphism and overriding: toString() provides custom string representation.
