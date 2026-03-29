## Primitive Data Types
- They store values directly in memory.

| Type    | Description              | Default | Size            | Example       | Range                           |
| ------- | ------------------------ | ------- | --------------- | ------------- | ------------------------------- |
| boolean | Logical values           | false   | Not JVM-defined | true, false   | true or false                   |
| byte    | 8-bit signed integer     | 0       | 1 byte          | 10            | -128 to 127                     |
| char    | 16-bit Unicode character | \u0000  | 2 bytes         | 'A', '\u0041' | 0 to 65,535                     |
| short   | 16-bit signed integer    | 0       | 2 bytes         | 2000          | -32,768 to 32,767               |
| int     | 32-bit signed integer    | 0       | 4 bytes         | 1000, -500    | -2,147,483,648 to 2,147,483,647 |
| long    | 64-bit signed integer    | 0L      | 8 bytes         | 123456789L    | ±9.22e18                        |
| float   | 32-bit floating point    | 0.0f    | 4 bytes         | 3.14f         | ~6–7 digits precision           |
| double  | 64-bit floating point    | 0.0d    | 8 bytes         | 3.14159d      | ~15–16 digits precision         |
```java
public class PrimitiveDataTypes {
	public static void main (String[] args){
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println("Is Java fun? :" + isJavaFun);
		System.out.println("Is Fish Tasty? :" + isFishTasty);
		
		byte age = 25;
        byte temperature = -10;
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        
        short students = 1000;
        short temp = -200;
        System.out.println("Students: " + students);
        System.out.println("Temperature: " + temp);
        
        int population = 2000000;
        int distance = 150000000;
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        
        long worldPopulation = 7800000000L;
        long lightYears = 9460730472580800L;
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Light Years: " + lightYears);
        
        float pi = 3.14f;
        float gravity = 9.81f;
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        
        double mathPi = 3.141592653589793;
        double avogadro = 6.02214076e23;
        System.out.println("Pi: " + mathPi);
        System.out.println("Avogadro's Number: " + avogadro);
        
        char grade = 'A';
        char symbol = '\$';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
}}
```
## Non Primitive Data Types
- They store references (memory addresses) rather than actual values.
- Created by users and include : String, Class, Object, Interface and Array
- **String** : 
	- They represent sequence of characters enclosed in double quotes,
	- They are objects and are immutable.
- Class : 
	- User defined blueprint that defines variables and method.
	- Foundation of Object Oriented Programming.
- Object : 
	- Instance of the class representing the real world entities.
	- It has a state, behavior, and identity.
- Interface :
	- A contract of abstract methods that implementing classes must define.
	- A way to achieve abstraction and multiple inheritance.
- Array : 
	- It stores multiple elements of the same type in a single structure.
	- They are objects, dynamically allocated and indexed from 0.

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String name = "Geek1";
        String message = "Welcome to Java";
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        
        Car myCar = new Car("Honda", 2021);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        
		Animal dog = new Dog();
        dog.sound();
        
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Geek1", "Geek2", "Geek3"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);
    }
}
```


# Keywords in Java
- Reserved words that have predefined meaning and are used by the Java Complier for internal process or repeat some predefined actions.

## Control Flow Keywords

| Keyword  | Usage                                                       |
| -------- | ----------------------------------------------------------- |
| if       | Executes code when a condition is true.                     |
| else     | Defines an alternate block when an `if` condition is false. |
| switch   | Selects one block of code among multiple options.           |
| case     | Defines an individual branch in a `switch` statement.       |
| default  | Defines the block executed if no case matches.              |
| for      | Starts a `for` loop.                                        |
| while    | Starts a `while` loop.                                      |
| do       | Starts a `do-while` loop.                                   |
| break    | Terminates the nearest loop or `switch`.                    |
| continue | Skips to the next iteration of a loop.                      |
| return   | Exits from a method and optionally returns a value.         |

## Exception Handling Keywords

| Keyword | Usage                                                         |
| ------- | ------------------------------------------------------------- |
| try     | Defines a block of code to test for exceptions.               |
| catch   | Defines a block to handle exceptions thrown by `try`.         |
| finally | Defines a block that always executes after `try` and `catch`. |
| throw   | Used to manually throw an exception.                          |
| throws  | Declares the exceptions a method can throw.                   |
| assert  | Tests assumptions during program execution for debuggin       |
## Object Oriented Keywords

|Keyword|Usage|
|---|---|
|class|Declares a class.|
|interface|Declares an interface.|
|extends|Indicates inheritance from a superclass.|
|implements|Indicates that a class implements an interface.|
|new|Creates new objects.|
|this|Refers to the current object.|
|super|Refers to the superclass of the current object.|
|abstract|Declares a class or method that must be implemented in a subclass.|
|final|Prevents inheritance, overriding, or modification.|
|static|Declares class-level variables or methods.|
|sealed|Restricts which classes can extend a given class.|
|permits|Specifies the subclasses allowed to extend a sealed class.|
## Access Control Keywords

|Keyword|Usage|
|---|---|
|public|Accessible from anywhere in the program.|
|protected|Accessible within the same package or by subclasses.|
|private|Accessible only within the same class.|
## Packaged Import Keywords

|Keyword|Usage|
|---|---|
|package|Defines a namespace for classes.|
|import|Allows access to classes from other packages.|

## Multithreading and Synchronization

| Keyword      | Usage                                                                |
| ------------ | -------------------------------------------------------------------- |
| synchronized | Defines critical sections that only one thread can access at a time. |
| volatile     | Indicates that a variable may change asynchronously.                 |

# Literal
- Literal is a value of boolean, numeric, character, or string data. 
- Any constant value that can be assigned to the variable is called a literal.

```java
public class Geeks {
    public static void main(String[] args)
    {
          // decimal-form literal
        int a = 101; 
          // octal-form literal
        int b = 0100; 
        // Hexa-decimal form literal
        int c = 0xFace; 
          // Binary literal
        int d = 0b1111; 
      
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
                // decimal-form literal (float type suffix 'f' or 'F' is required)
        float e = 101.230f; 

        // It is a decimal literal despite the leading zero
        float f = 0123.222f; 

        // Hexadecimal floating-point literals ARE supported in Java (since Java 5).
        // They use 'p' or 'P' to specify the binary exponent.
    
        double g = 0x1.8p3;   // 1.8 (hex) × 2^3 = 12.0
      
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        
        // single character literal within single quotes
        char ch = 'a';

        // invalid octal literal (causes compilation error)
        // char b = 0789; 

        // Unicode representation
        char chd = '\u0061'; 

        System.out.println(ch);
        
        // commented out due to error
        // System.out.println(b); 
        
        System.out.println(chd);

        // Escape character literal
        System.out.println("\"  is a symbol");
    }
}
```
