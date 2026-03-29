- Decision making is usually based on the ifs and else statement.

## If else If ladder
```java
import java.util.*;

class ifElseIf {
    public static void main(String args[])
    {
        int i = 20;

        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
    }
}
```
## Switch cases
```java
import java.io.*;

class switchCase {
    public static void main(String[] args)
    {
        int num = 20;
        switch (num) {
        case 5:
            System.out.println("It is 5");
            break;
        case 10:
            System.out.println("It is 10");
            break;
        case 15:
            System.out.println("It is 15");
            break;
        case 20:
            System.out.println("It is 20");
            break;
        default:
            System.out.println("Not present");
        }
    }
}
```
## Ternary Operator
```java
class ternary {
    public static void main(String args[]) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;

        System.out.println("Maximum is " + max);
    }
}
```

|Features|if-else|switch-case|
|---|---|---|
|Use Case|Suitable for condition-based checks|Best for exact value matching|
|Readability|More readable for a few conditions|More readable and efficient for many cases|
|Performance|Slower for many checks due to multiple conditions|Faster and optimized for handling many cases|
|Flexibility|Supports ranges and complex conditions|Only supports exact matches of values|
# Looping
- It allows a set of instructions to run multiple times based on a condition.
- Java has 3 types of loops.

## 1. for loop
- For when we know the number of times we want to repeat a task
- Statement includes initialization, condition and increment/decrement.

```java
// Java program to demonstrates the working of for loop
import java.io.*;

class forLoop {
    public static void main(String[] args)
    {
    //for loop
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        
        String[] names = { "Sweta", "Gudly", "Amiya" };
        
    // for each loop 
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
```

```java
// Java program to demonstrate 
// the infinite for loop
import java.io.*;

class InfiniteLoopFor {
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i--) {

            System.out.println(
                "This loop will run forever");
        }
    }
}
```

## 2. while loop
- While loop is used when we want to check condition before executing the loop body

```java
// Java program to demonstrates 
// the working of while loop
import java.io.*;

class whileLoop {
    public static void main(String[] args)
    {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}
```

```java
// Java Program to demonstrate 
// the infinite while loop
import java.io.*;

class InfiniteLoopWhile {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println(
                "Basic example of infinte loop");
        }
    }
}
```

## 3. do while loop
- Ensures that the code block is executed at least once

```java
// Java program to demonstrates 
// the working of do-while loop
import java.io.*;

class doWhileLoop {
    public static void main(String[] args)
    {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
}
```