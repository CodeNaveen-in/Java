- Special Symbols that perform operations.

## Arithmetic Operators

```java
public class Arithmetic{
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        // Addition
        int sum = a + b;
        
        // Subtraction
        int diff = a - b;
        
        // Multiplication
        int mul = a * b;
        
        // Division
        int div = a / b;
        
        // Modulus
        int mod = a % b;      // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
    }
}
```

## Unary Operator
```java
import java.io.*;

// Driver Class
class Unary{

    public static void main(String[] args){
        
        // Integer declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
```

## Assignment Operator
```java
public class Assignment{
    public static void main(String[] args){
        
        int n = 10;
        
        // n = n + 5
        n += 5;  
        System.out.println("After += : " + n);
        
        // n = n * 2
        n *= 2;  
        System.out.println("After *= : " + n);
        
        // n = n - 5
        n -= 5;
        System.out.println("After -= : " + n);
        
        // n = n / 2
        n /= 2;  
        System.out.println("After /= : " + n);
        
        // n = n % 3
        n %= 3;
        System.out.println("After %= : " + n);
    }
}
```

## Relational Operator
```java
import java.io.*;

class Relational{
    
    public static void main(String[] args){
        
        // Comparison operators
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}
```

## Logical Operator
```java
import java.io.*;

class Logical {
  
      // Main Function
    public static void main (String[] args) {
      
        // Logical operators
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
```

## Ternary Operator
```java
public class Ternary{
  
    public static void main(String[] args){
        
        int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
    }
}
```

## Bitwise Operator
```java
import java.io.*;

class Bitwise 
{
    public static void main(String[] args)
    {
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}
```

## Instanceof Operator
```java
public class Instanceof{
    
    public static void main(String[] args){
        
        String str = "Hello";
        System.out.println(str instanceof String); 

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer); 
        System.out.println(obj instanceof String);  
    }
}
```
# Operator Associativity

- Associativity determines the order of evaluation when multiple operators of same precedence appear in an expression.
## Left to Right Associativity
- Arithmetic operators: +, -, *, /, %
- Relational operators: >, <, >=, <=
- Logical AND/OR: &&, ||
- Bitwise operators: &, |, ^, <<, >>

```java
public class LeftToRight {

    public static void main(String[] args)
    {
        int a = 10, b = 5, c = 2;
        int result
            = a - b + c; // evaluated as (10 - 5) + 2 = 7
        System.out.println("Final output " + result);
    }
}
```

## Right to Left Associativity
- Assignment operators: =, +=, -=, etc.
- Unary operators: ++, --, !, ~

```java
public class RightToLeftAssociativity {

    public static void main(String[] args)
    {
        int a, b;
        a = b = 4; // evaluated as a = (b = 4)
        System.out.println("a: " + a); // 4
        System.out.println("b: " + b); // 4
    }
}
```
