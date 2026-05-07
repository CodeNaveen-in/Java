- This represents a class where a sequence of characters are stored that can be modified.
- It means we can change the content of String Buffer without creating a new object.

```java
public class StringBufferExample {
    public static void main(String[] args){
      
      	// Creating StringBuffer
        StringBuffer s = new StringBuffer();
      
      	// Adding elements in StringBuffer
        s.append("Hello");
        s.append(" ");
        s.append("world");
        
      	// String with the StringBuffer value
      	String str = s.toString();
        System.out.println(str);
    }
}
```
## Construction of a StringBuffer Class
- Stringbuffer() gives room for 16 characters without reallocation.
- Stringbuffer(int size) takes an integer argument that sets size of the buffer.
- Stringbuffer(string str) takes any string argument and makes it to string buffer with more 16 more characters.

```java
public class StringBufferMaking {
    public static void main(String[] args) {

        // 1. Using default constructor
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        System.out.println("Default Constructor: " + sb1);

        // 2. Using constructor with specified capacity
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Java Programming");
        System.out.println("With Capacity 50: " + sb2);

        // 3. Using constructor with String
        StringBuffer sb3 = new StringBuffer("Welcome");
        sb3.append(" to Java");
        System.out.println("With String: " + sb3);
    }
}
```

## Methods of StringBuffer
- Append - concatenates the argument with string.
- Insert - It inserts the given string with this string at the position.
- replace - It replace the given string from the specified begin index and endIndex-1.
- delete - It deletes the string from specified beginIndex to endIndex-1.
- reverse - It reverses the current string
- capacity - it returns the current capacity of the buffer, originally it is 16 but when increased it becomes 2n+2.
- length - it returns the number of character in the string,

```java
import java.io.*;

class StringBufferMethod {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        sb.insert(1, "Java");
        sb.replace(1, 3, "Java");
        sb.delete(1, 3);
        sb.reverse();
        System.out.println(sb);
		System.out.println(sb.capacity()); 
        sb.append("java is my favourite language");
      	// (oldcapacity*2)+2
      	System.out.println(sb.capacity());
      	int p = s.length();
      	System.out.println("Length of string GeeksforGeeks=" + p);
    }
}
```