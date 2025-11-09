# Consider the following Java program. 
Implement the code as instructed in the comment, such that it satisfies the given test cases.

## What This Program Does:
- Defines a base class Shape with default area() and volume() methods.
- Rectangle overrides area() to return width × height.
- Cube overrides both area() (surface area) and volume() (cube of side).
- The caller() method uses instanceof to determine the actual type of Shape and prints:
	- Area for Rectangle
	- Volume for Cube
