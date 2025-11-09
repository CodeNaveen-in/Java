import java.util.Scanner; // Imports the Scanner class for reading input from the user

// Defines a class named Employee
class Employee {
    String ename; // Stores the employee's name
    String eid;   // Stores the employee's ID
    String edept; // Stores the employee's department

    // Default constructor: sets ename to "guest"
    public Employee() {
        ename = "guest";
    }

    // Parameterized constructor: initializes all fields with provided values
    public Employee(String name, String id, String dept) {
        ename = name;  // Assigns the provided name to ename
        eid = id;      // Assigns the provided ID to eid
        edept = dept;  // Assigns the provided department to edept
    }

    // Method to copy department from another Employee object
    public void copyDept(Employee e) {
        this.edept = e.edept; // Copies edept from object 'e' to current object
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ename : " + this.ename); // Prints employee name
        System.out.println("eid : " + this.eid);     // Prints employee ID
        System.out.println("edept : " + this.edept); // Prints employee department
    }
}

// Main class containing the main method
public class FClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in); // Creates Scanner object to read user input

        Employee e1 = new Employee(); // Creates an Employee object using default constructor

        // Reads name of the employee from user input
        String name = s.nextLine();

        // Reads ID of the employee from user input
        String id = s.nextLine();

        // Reads department of the employee from user input
        String dept = s.nextLine();

        // Creates another Employee object using parameterized constructor
        Employee e2 = new Employee(name, id, dept);

        e1.copyDept(e2); // Copies department from e2 to e1

        e1.displayDetails(); // Displays details of e1
    }
}
