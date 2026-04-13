- Java methods are blocks of code that perform a specific task.
- They allow us to : 
	- reuse code, 
	-  read code effectively.
	- increase modularity of code
	- maintain the code
- Java methods must belong to a class

```java
public class MethodSample
{
    // An example method
    public void printMessage() {
        System.out.println("Hello, Fellow reader!");
    }
    public static void main(String[] args) {
        // Create an instance of class having method
        MethodSample obj = new MethodSample();       
        // Calling method
        obj.printMessage(); 
    }
}
```

## Method Syntax
- **Modifier** - to define access level
- **Return Type** - to know what to return
- **Method Name** - name of the method (camelCase)
- **Parameter List** - in case of optional inputs
- **Body** - Presenting the logic

## Call Stack
- Structure used by the program during the runtime of Java.
- It operates in LIFO manner

```java
public class CallStackExample {

    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C");
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}
```

## Type of methods 

- **Pre-defined** - Methods that are already present in the java class libraries.
- **User-defined** - Methods that user defines for their requirements.

```java
Math.random()    // returns random value
Math.PI     //returns the value of π as a constant. 

sayHello()         // user define method 
Greet() 
setName()
```

## To Create Method
- **Instance Method** - Access the instance data using the object name.
- **Static Method** - Access the static data using the class name. 

```java
void instance_method() {
	//body of method
	}

static void static_method() {
	//body of method
	}
```

## Calling a method
- **User defined method** - Create the object of the class then call the method.
- **Abstract method** - They are methods with no body and must be overridden by subclass. Invoked via calling an object of the subclass.
- **Predefined Method** - They are called by invoking upon an object directly.
- **Static Method** - They are called without creating the object as they belong to class and not object.

```java
class Geeks {
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Create object
        obj.hello();             // Call method
    }
}

abstract class GeeksHelp {
    abstract void check(String name); // Abstract method
}

public class Geeks extends GeeksHelp {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Subclass object
        obj.check("GeeksforGeeks");
    }
}

public class Geeks {
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        System.out.println(obj.hashCode()); // Predefined method
    }
}

class Test {
    static void hello() {
        System.out.println("Hello");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Test.hello(); // Call static method directly
    }
}
```

|Features|Static method|Instance method|
|---|---|---|
|Definition|Created using the static keyword and retrieved without creating an object.|Requires an object of its class to be invoked.|
|Access|Access only static variables and methods.|Can access both static and instance members.|
|**`**this**`** ****keyword****|Cannot use the [this](https://www.geeksforgeeks.org/java/java-this-keyword/) keyword within static methods.|Can use the this keyword to refer to the current object.|
|Override|Does not support runtime polymorphism|Supports runtime polymorphism|
|Memory Allocation|Loaded once per class|Each object has its own copy|
# Command line arguments
When the following program is compiled then it prints all the arguments given in string by given per line.

```java
class Hello {
    // Main driver method
    public static void main(String[] args)
    {
        // Checking if length of args array is
        // greater than 0
        if (args.length > 0) {
            // Print statements
            System.out.println("The command line arguments are:");

            // Iterating the args array
            // using for each loop
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line arguments found.");
    }
}
```

# Varags 
- They are variable arguments in java.
- It allows you to take multiple parameter in java method.
- Helps eliminate the need of multiple overloaders.

```java
import java.io.*;
class varArgs {
  
    // Method that accepts variable number of String arguments using varargs
    public static void Names(String... n) {
      
        // Iterate through the array and print each name
        for (String i : n) {
            System.out.print(i + " "); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
      
        // Calling the 'Names' method with different number of arguments
        Names("var1", "var2");           
        Names("var1", "var2", "var3");   
    }
}
```

```java
class varArgs2 {
    // A method that takes variable number of integer arguments.
    static void fun(int... a)
    {
        System.out.println("Number of arguments: " + a.length);
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with one parameter
        fun(100);
        // four parameters
        fun(1, 2, 3, 4);
        // no parameter
        fun();
    }
}
```

```java
class varArgs3{
    // Takes string as a argument followed by varargs
    static void fun2(String s, int... a) {
        System.out.println("String: " + s);
        System.out.println("Number of arguments is: "
                           + a.length);
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");

        System.out.println();
    }
    public static void main(String args[])
    {
        // Calling fun2() with different parameter
        fun2("GeeksforGeeks", 100, 200);
        fun2("CSPortal", 1, 2, 3, 4, 5);
        fun2("forGeeks");
    }
}
```

### Rules for Varargs
- You can't make two variable arguments in a single method
- You have to make variable argument the last parameter.

