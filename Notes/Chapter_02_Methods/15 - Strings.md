- String is an object used to store a sequence of characters enclosed in double stores.
- String uses UTF-16 encoding.
- Strings are immutable.

```java
public class Stringi {
    // Main Function
    public static void main(String args[])
    {
        // creating Java string using a new keyword
        String str = new String("Hello World");
        System.out.println(str);
    }
}
```

# Ways to create a Java String

## 1. String Literal
- It is so that no new memory is created and the constants are fetched from the string pool
```java
String str = "HelloString";
```

## 2. New Keyword
- It creates a new object in heap memory.
- The reference variable points to the heap object.
```java
String str  = new String("NewlyString");
```

- All String objects are stored in heap memory.
- The String Constant Pool is a special area inside the heap used to store unique string literals.

```java
class StringStyle
 {
    public static void main(String args[])
    {
        
      	// Declaring Strings using String literals
        String s1 = "TAT";
        String s2 = "TAT";

        // Declaring Strings using new keyword
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        // Printing all the Strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
 }
```

# Key Features of String Class

1. Immutable - Once an object is created then it's value cannot be changed.
2. Thread Safety - It is thread safe because it is immutable, allowing access by multiple threads.
3. Supports Utility - It contains various methods that one can apply.
4. Implements Interface - It allows to implement important interface.

```java
public class StringWorks {
    public static void main(String[] args) {
        
        // Constructor 1: Creating string using new keyword
        String str1 = new String("Hello Java");
        System.out.println("String using new keyword: " + str1);

        // Constructor 2: Creating string from character array
        char[] charArray = { 'J', 'A', 'V', 'A' };
        String str2 = new String(charArray);
        System.out.println("String from char array: " + str2);

        // Constructor 3: Creating string from byte array
        byte[] byteArray = { 72, 101, 108, 108, 111 };
        String str3 = new String(byteArray);
        System.out.println("String from byte array: " + str3);
    }
}
```