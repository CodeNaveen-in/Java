- Variables are containers used to store data in memory.
- Variables define how data is stored, accessed and manipulated.
- Variable has 3 components : 
	- Data Type
	- Variable Name
	- Value

```java
class Variables{
    public static void main(String[] args) {
        // Declaring and initializing variables
        
        // Initializing float variable
        float si = 5.5f; 
        
        // Initializing integer variables
        int t = 10; 
        int s = 20; 
        
        // Initializing character variable
        char var = 'h';               

        // Displaying the values of the variables
        System.out.println("Simple Interest: " + si);  
        System.out.println("Speed: " + s);                      
        System.out.println("Time: " + t);                        
        System.out.println("Character: " + var);                
    }
}
```

# Typecasting
- It is the process of converting one data type to another data type..
- Type of Type Casting : 
	- Widening Type
	- Narrow Type

## Widening Type Casting (Implicit)

- A lower data type is transformed into a higher one by a process.
- There is no chance of data loss, so it is secure.
- Done when target type is larger than source type.
- Both data types must be compatible.

```java
import java.io.*;

class Implicit {
    public static void main(String[] args)
    {
        int i = 10;

        // Widening Type Casting (Automatic Casting) from int to long
        long l = i;

        // Widening Type Casting (Automatic Casting) from int to double
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
    }
}
```

## Narrow Type Casting (Explicit)

- A bigger data type is downsized into a smaller data type.
- It is also called narrowing type casting.
- It is unsafe to do because data loss might happen.
- A cast operator is helpful in the process.

```java
import java.io.*;

class Explicit {
    public static void main(String[] args)
    {
        double i = 100.245;

        // Narrowing Type Casting
        short j = (short)i;
        int k = (int)i;

        System.out.println("Original Value before Casting" + i);
        System.out.println("After Type Casting to short " + j);
        System.out.println("After Type Casting to int " + k);
    }
}
```

### Explicit Upcasting
- Casting a subtype into a supertype in the inheritance tree's upward direction.
```java
import java.io.*;

class Animal {
    public void makeSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound()
    {
        System.out.println("The dog barks");
    }

    public void fetch()
    {
        System.out.println("The dog fetches a ball");
    }
}
class UpcastingExplicit {
    public static void main(String[] args)
    { // Upcasting
        Animal animal = new Dog();
        // Calls the overridden method in Dog class
        animal.makeSound();
        // This would give a compile error as fetch() is not
        // a method in Animal class
        // animal.fetch();
    }
}
```

### Explicit Downcasting
- Subclass of an object refers to an object of the parent class.
- If done manually the compiler issues a runtime ClassCastException error.
- Can only be done using instanceof operator.
- Only downcasting of an object that has already been upcast is possible.

```java
import java.io.*;
class Animal {
    public void eat()
    {
        System.out.println("The animal is eating.");
    }
}

class Cat extends Animal {
    public void meow()
    {
        System.out.println("The cat is meowing.");
    }
}

class Geeks {
    public static void main(String[] args)
    {
        Animal animal = new Cat();
        animal.eat();

        // Explicit downcasting
        Cat cat = (Cat)animal;
        cat.meow();
    }
}
```

But doing this manually may cause error that is why we use instance of to check.
```java
if (obj instanceof String) {
	String s = (String) obj;
	System.out.println("String value: " + s);
}
```
