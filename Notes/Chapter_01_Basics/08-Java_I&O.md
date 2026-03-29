# Input and Output
- System.in : Standard input stream
- System.out : Standard output stream
- System.err : Standard error stream

```java
import java.io.IOException;

public class SystemInandOutExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");

        // Reads a single byte from System.in
        int data = System.in.read();  

        // Print the character and its ASCII value
        System.out.println("You entered: " + (char) data);
        System.out.println("ASCII Value: " + data);
        
		// using print() and println() printing words in lines
        System.out.print("line 1! ");
        System.out.println("line 2! ");
        System.out.printf("line 3! ");
        
		int x = 100;
      
        // Printing a simple integer
        System.out.printf("Printing simple integer: x = %d%n", x);

        // Printing a floating-point number with precision
        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float n = 5.2f;

        // Formatting a float to 4 decimal places
        System.out.printf("Formatted to specific width: n = %.4f%n", n);

        n = 2324435.3f;

        // Right-aligning and formatting a float to 20-character width
        System.out.printf("Formatted to right margin: n = %20.4f%n", n);
        
    }
}
```

```java
public class ErrorLineUps {
  
    public static void main(String[] args) {
      
        // Using print()
        System.err.print("This is an error message using print().\n");

        // Using println()
        System.err.println("This is another error message using println().");

        //Using printf()
        System.err.printf("Error code: %d, Message: %s%n", 404, "Not Found");
    }
}
```

# Type of Stream
### 1. ByteStream
- Used in Java to perform input and output of 8-bit bytes.
- Suitable for handling raw binary data such as images, audio, and video.
- They use classes like InputStream, and OutputStream.

|Stream class|Description|
|---|---|
|[BufferedInputStream](https://www.geeksforgeeks.org/java/java-io-bufferedinputstream-class-java/)|Used to read data more efficiently with buffering.|
|[DataInputStream](https://www.geeksforgeeks.org/java/java-io-datainputstream-class-java-set-1/)|Provides methods to read Java primitive data types.|
|[FileInputStream](https://www.geeksforgeeks.org/java/java-io-fileinputstream-class-java/)|This is used to read from a file.|
|[InputStream](https://www.geeksforgeeks.org/java/java-io-inputstream-class-in-java/)|This is an abstract class that describes stream input.|
|[PrintStream](https://www.geeksforgeeks.org/java/java-io-printstream-class-java-set-1/)|This contains the most used print() and println() method|
|[BufferedOutputStream](https://www.geeksforgeeks.org/java/java-io-bufferedoutputstream-class-java/)|This is used for Buffered Output Stream.|
|[DataOutputStream](https://www.geeksforgeeks.org/java/dataoutputstream-in-java/)|This contains method for writing java standard data types.|
|[FileOutputStream](https://www.geeksforgeeks.org/java/creating-a-file-using-fileoutputstream/)|This is used to write to a file.|
|[OutputStream](https://www.geeksforgeeks.org/java/java-io-outputstream-class-java/)|This is an abstract class that describes stream output.|
```java
import java.io.*;
public class ByteStream {
    public static void main(
        String[] args) throws IOException
    {

        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream
                = new FileInputStream("sourcefile.txt");
            targetStream
                = new FileOutputStream("targetfile.txt");

            // Reading source file and writing content to target file byte by byte
            int temp;
            while ((
                       temp = sourceStream.read())
                   != -1)
                targetStream.write((byte)temp);
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}
```

### 2. CharacterStream
- Used to perform input and output of 16-bit Unicode characters.
- Best suited for handling text data.
- Using classes like reader and writer.
- It automatically handle encoding and decoding.

|Stream class|Description|
|---|---|
|[BufferedReader](https://www.geeksforgeeks.org/java/java-io-bufferedreader-class-java/)|It is used to handle buffered input stream.|
|[FileReader](https://www.geeksforgeeks.org/java/file-handling-java-using-filewriter-filereader/)|This is an input stream that reads from file.|
|[InputStreamReader](https://www.geeksforgeeks.org/java/inputstreamreader-class-in-java/)|This input stream is used to translate byte to character.|
|OutputStreamWriter|Converts character stream to byte stream.|
|[Reader](https://www.geeksforgeeks.org/java/java-io-reader-class-java/)|This is an abstract class that define character stream input.|
|[PrintWriter](https://www.geeksforgeeks.org/java/java-io-printwriter-class-java-set-1/)|This contains the most used print() and println() method|
|[Writer](https://www.geeksforgeeks.org/java/java-io-writer-class-java/)|This is an abstract class that define character stream output.|
|[BufferedWriter](https://www.geeksforgeeks.org/java/io-bufferedwriter-class-methods-java/)|This is used to handle buffered output stream.|
|[FileWriter](https://www.geeksforgeeks.org/java/file-handling-java-using-filewriter-filereader/)|This is used to output stream that writes to file.|

```java
import java.io.*;

public class ReaderandWriter 
{
    public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
        
      	try {
            sourceStream = new FileReader("test.txt");

            // Reading sourcefile character by character.
            int temp;
          
            while (( temp = sourceStream.read())!= -1 )
                System.out.println((char)temp);
        }
        finally {
          
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
```