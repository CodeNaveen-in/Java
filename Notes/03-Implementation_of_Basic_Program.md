# Hello World Program
```java
public class HelloWorld {
    
    // Your program begins with a call to main()
    public static void main(String[] args)
    {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }
}
```

- **Class** - Every program must have at-least one class.
	- If the class is public then it must match the filename.
- **Main Method** - Entry point of all the application
	- **public** - Allows JVM to access the method from anywhere.
	- **static** - Method can run without creating an object.
	- **void** - It doesn't return any value.
	- **String[] args** - Accepts command-line arguments.
- **System.out.println()** - Prints the output to the console.
	- **System** - Built-in class from java.lang package.
	- **out** - Static member of the System.
	- **println** - Method that prints to console and moves to the next line.

### Process of execution
- Source Code
- JAVA Compiler
- Bytecode
- Class loader
- Bytecode verifier
- JIT Compiler

```bash
javac Helloworld.java
java Helloworld
```

# Sum Total
```java
public class SumToal{
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        int num1 = 2;
        int num2 = 5;
        int total = num1 * 1 + num2 * 2;
        System.out.println("Total: " + total);
    }
}
```

## Basic Blocks of a program
#### Package
- Groups related to classes and interfaces
- Helping organize code and prevent naming conflict
#### Class 
- Defines variables and method
- Serving as a blueprint for creating
#### Method
- A block of code that performs a specific task.
- The main() method acts as primary entry point.
	- It is always static.
- Can also be instance or static.
#### Variable 
- Named memory location used to store and manipulate data during execution.
#### Statement
- An instruction that performs an action.

# Type of Data Members
|Instance Data Members|Static Data Members|
|---|---|
|Memory is allocated every time an object is created.|Memory is allocated only once when the class is loaded.|
|Each object has its own copy of instance variables.|All objects share a single copy of static variables|
|Declared without the static keyword|Declared using the static keyword.|
|Accessed using the object name|Accessed using the class name|
|It is known as Object-level data members.|It is Known as Class-level data members.|
|Value can be different for each object.|Value is common for all objects of the class.|

# Type of Methods
|Instance Methods|Static Methods|
|---|---|
|Used to perform tasks related to individual objects, such as reading records from a file or processing object-specific data.|Used to perform operations that are related to the class as a whole, such as utility functions or managing shared resources.|
|Do not require the static keyword in their definition.<br><br>Syntax: void net_salary(parameters) { statements; }|Must include the static keyword in their definition.<br><br>Syntax: static void basic_salary(parameters) { statements; }|
|Accessed through an object of the class|Accessed through the class name.|
|Can access both instance variables and static variable|Cannot access instance variables or methods without an object reference.|
