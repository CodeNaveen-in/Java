- String is a sequence of characters used to storing and manipulating text.
- It has many built in methods for operations.

```java
public class Geeks{
    public static void main(String[] args) {
        String str = "StringMethodsPractice";

        System.out.println("Length: " + str.length());  
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(2, 6));
    }
}
```

## Java String Methods
### 1. Length
- It gives the length of the total count of characters.
```java
public class LengthMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.length());
    }
}
```
### 2. Character Method
- It returns the character at the given index.
```java
public class CharacterMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.charAt(7));
    }
}
```
### 3. Substring Method
- It gives back the substring from the index to the end (or index).
- Default is to the end of the string.
```java
public class SubstringMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.substring(7, 12));
        System.out.println(s.substring(7));
    }
}
```
### 4. Concate Method
- It appends the string to the end of the String.
```java
public class ConcatMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.concat("!!!"));
    }
}
```
### 5. Index Method
- It returns the index within the string of the first occurrence of the specified string.
- If the string is not present then it returns -1 by default.
- It starts searching from index 0 but if given then from given index.
```java
public class IndexMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.indexOf("World"));
        System.out.println(str.indexOf("l", 4));
    }
}
```
### 6. Last Index Method
- This method returns the index within the string of the last occurrence of the specified string.
- If It is not found in the input string, then method returns -1 by default.
```java
public class LastIndexMethod {
    public static void main(String[] args) {
        String s = "Hello, Worlo!";
        System.out.println(s.lastIndexOf("lo"));
    }
}
```
### 7. Equals Method
- It compares the string to the specified object and returns the boolean.
```java
public class EqualsMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.equals("Hello, World!"));
    }
}
```
### 8. IgnoreCase Equals Method
- It compares string without taking the casing into account.
```java
public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.equalsIgnoreCase("hello, world!"));
    }
}
```
### 9. Compare To Method
- It compares two string lexicographically.
```java
public class CompareToMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.compareTo("Hello, Java!"));
    }
}
```
### 10. Casing change
- **toLowerCase** - It changes the characters in the string to lower case.
- **toUpperCase** - It changes the characters in the string to upper case.
```java
public class CaseChangeMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
```
### 11. Trim Method
- It returns the copy of the string while removing the whitespace from both ends.
```java
public class TrimMethod {
    public static void main(String[] args) {
        String s = "   Hello, Trim!   ";
        System.out.println("'" + s.trim() + "'");
    }
}
```
### 12. Replace Method
- It returns a new string where all instances are replaced.
```java
public class ReplaceMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.replace('l', 'x'));
    }
}
```
### 13. Contains Method
- It returns true if the string contains the given string
```java
public class ContainsMethod {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.contains("World"));
    }
}
```

### 14. Character Array Method
- It converts string into character array
```java
public class CharacterArrayMethod {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }
    }
}
```
