Student Registration using Inner Classes
Write a Java code that gives a simple demonstration of how a set of student registration requests are processed in a department in a college. It accepts a specific number of seats as input, and prints whether the registration is successful or not, based on the remaining seats left. The code uses the concept of inner classes, and has the following components: The program should incalude the following components:

Interface Registerable has an abstract method register().
Class Department with:
Instance variable name (String) representing the department name
Constructor to initialize the instance variable
an inner private class DeptEnquiry that has / does the following:
reqseats, avalseats as instance variables that hold the number of requested seats and available seats, respectively.
implements interface Registerable (that has method register which returns a string that describes whether registration is successful or not) that enables its object to be accessible from outside the class Department.
constructor to initialize the instance variables
method public String register() checks whether avalseats is less than reqseats. If it is less, then it returns "Cannot register", else it returns "Registered successfully available seats are <available seats>".
method enrollRequest(int) that takes as input the number of seats to be registered as an argument and returns a Registerable object on which method register() can be invoked.
Class Student has method main that does the following:
creates an object of Department with the name DCSE. Using this object, it invokes method enrollRequest to obtain a Registerable object, which invokes method register on it.
What you have to do

Define method enrollRequest() in class Department
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

interface Registerable {
    public abstract String register();
}

class Department {
    String name;

    public Department(String n) {
        name = n;
    }

    private class DeptEnquiry implements Registerable {
        int reqseats;
        int avalseats;

        public DeptEnquiry(int s) {
            reqseats = s;
            avalseats = 5;
        }

        public String register() {
            if (avalseats < reqseats) {
                return "Cannot register";
            } else {
                avalseats = avalseats - reqseats;
                return "Registered successfully available seats are " + avalseats;
            }
        }
    }



    // DEFINE method enrollRequest()
    
    public Registerable enrollRequest(int nseats) {
        return new DeptEnquiry(nseats);
    }
    


}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d1 = new Department("DCSE");
        Registerable r1 = d1.enrollRequest(sc.nextInt());
        System.out.println(r1.register());
    }
}
```