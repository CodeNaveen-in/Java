Doctor and Surgeon - Inheritance
A hospital management system maintains records of doctors and their specializations. The base class Doctor has attributes for the doctor’s name and department. The subclass Surgeon inherits from Doctor and has an additional attribute for the number of surgeries performed.

Write a Java program that creates a Surgeon object and displays the surgeon’s name, department, and number of surgeries performed.

Class Doctor has the following members:
Private instance variables String name and String department
Constructor to initialize the instance variables
Method toString() that returns a formatted string with doctor name and departement.
Class Surgeon should:
Inherit from Doctor
Have a private instance variable int surgeries
Constructor to initialize the instance variables
Override toString() such that it uses the parent class’s toString() method and appends surgeries information to the returned string as given in the test cases.
Class HospitalSystem should:
Create an object of Surgeon using input values for name, department, and surgeries
Print the object
What you have to do
Define the constructor in class Doctor
Define the toString() method in class Doctor
Define the constructor in class Surgeon
Define the toString() method in class Surgeon
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

class Doctor {
    private String name;
    private String department;


    
    
    public Doctor(String n, String d){
        name = n;
        department = d;
    }

    public String toString(){
        return name + " from " + department;
    }
    
}

class Surgeon extends Doctor {
    private int surgeries;

    
    
    public Surgeon(String n, String d, int s){
        super(n, d);
        surgeries = s;
    }

    public String toString(){
        return super.toString() + ", Surgeries: " + surgeries;
    }
    
}



public class HospitalSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String dept = sc.next();
        int surgeries = sc.nextInt();
        Surgeon d = new Surgeon(name, dept, surgeries);
        System.out.println(d);
    }
}
```