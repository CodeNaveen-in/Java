Design and Poster Details using Inheritance
Write a Java program that defines a base class Design to store common design details and a subclass Poster to store poster-specific information. The program should create objects of both classes, override methods to display design details, and print the details uniformly.

Class Design has/should have the following members:
Public instance variable String title
Constructor to initialize the instance variable
Method getDetails() that returns design details in the format:
Design: `<title>`
Class Poster should:
Inherit from Design
Have a private instance variable String size
Constructor to initialize the instance variables
Override method getDetails() such that it returns details in the format:
Poster: `<title>`, Size: `<size>`
Class DesignApp should:
Define a method display(T obj) that prints the details of the object by invoking its getDetails() method
main method that does the following:
Create one object of Design and one object of Poster
Use the method display() to print details of both objects
What you have to do
Define the method getDetails() in class Design
Override the method getDetails() in class Poster
Define the method display() in class DesignApp
Java documentation can be accessed at:
https://docs.oracle.com/en/java/javase/11/docs/api/

Note:
It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

class Design {
    public String title;

    public Design(String t) {
        title = t;
    }



    
    
    public String getDetails() {
        return "Design: " + title;
    }
    
}

class Poster extends Design {
    private String size;

    public Poster(String t, String s) {
        super(t);
        size = s;
    }

    
    
    public String getDetails() {
        return "Poster: " + title + ", Size: " + size;
    }
    
}

class DesignApp {

    
    
    public static <T extends Design> void display(T obj) {
        System.out.println(obj.getDetails());
    }
    
}



public class DesignAppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String designTitle = sc.next();
        String posterTitle = sc.next();
        String size = sc.next();

        Design d = new Design(designTitle);
        Poster p = new Poster(posterTitle, size);

        DesignApp.display(d);
        DesignApp.display(p);

        sc.close();
    }
}
```