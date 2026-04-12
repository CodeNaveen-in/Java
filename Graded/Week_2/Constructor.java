/**
 * TOPIC: Object-Oriented Programming (OOP) 
 * CONCEPTS: Default vs. Parameterized Constructors, 'this' keyword, and Object References.
 */

import java.util.Scanner;

class Employee {
    String ename;
    String eid;
    String edept;

    // 1. DEFAULT CONSTRUCTOR
    // Called when we write 'new Employee()'. It sets a starting value.
    public Employee() {
        ename = "guest"; 
        // eid and edept remain null by default
    }

    // 2. PARAMETERIZED CONSTRUCTOR
    // Called when we pass arguments. It "constructs" the object with specific data.
    public Employee(String name, String id, String dept) {
        ename = name;
        eid = id;
        edept = dept;
    }

    // 3. PASSING OBJECT AS AN ARGUMENT
    // This method takes another Employee object (e) and copies its department.
    public void copyDept(Employee e) {
        // 'this.edept' refers to the department of the object calling the method
        // 'e.edept' refers to the department of the object passed in
        this.edept = e.edept;
    }

    public void displayDetails() {
        System.out.println("ename : " + this.ename);
        System.out.println("eid : " + this.eid);
        System.out.println("edept : " + this.edept);
    }
}

public class Constructor {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Object e1 is created using the Default Constructor
        // e1 state: ename="guest", eid=null, edept=null
        Employee e1 = new Employee();

        // Taking user inputs for the second employee
        String name = s.nextLine();
        String id = s.nextLine();
        String dept = s.nextLine();

        // Object e2 is created using the Parameterized Constructor with user inputs
        Employee e2 = new Employee(name, id, dept);

        // The "Magic" Step:
        // e1 calls copyDept and looks inside e2 to grab the department name.
        e1.copyDept(e2); 

        // Displaying e1 to see the changes
        e1.displayDetails();
        
        s.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. CONSTRUCTOR OVERLOADING: 
     The class has two versions of the constructor. Java decides which one to 
     use based on the arguments you provide. This is a form of Compile-time Polymorphism.

  2. THE 'this' KEYWORD: 
     In `this.edept`, 'this' acts as a self-reference. It explicitly points to 
     the instance variable of the current object to avoid confusion.

  3. OBJECT INTERACTION: 
     In `copyDept(Employee e)`, we are passing a "reference" to object e2. 
     The method reaches into e2's memory, grabs the value of `edept`, and 
     assigns it to e1's `edept`.

  4. EXPECTED OUTPUT (If you input: Naveen, 101, AI):
     ename : guest
     eid : null
     edept : AI

  5. WHY?
     - 'ename' is "guest" because e1 used the default constructor.
     - 'eid' is "null" because the default constructor never assigned it a value.
     - 'edept' is "AI" because e1.copyDept(e2) successfully copied "AI" from e2.
  --------------------------------------------------
*/