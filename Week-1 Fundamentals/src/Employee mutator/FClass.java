import java.util.*; // Imports all utility classes, including Scanner for user input

// Employee class definition
class Employee {
    String eid;           // Employee ID
    String ename;         // Employee name
    String eprojects[];   // Array of project codes assigned to the employee

    // Copy constructor: creates a deep copy of another Employee object
    public Employee(Employee e) {
        this.eid = e.eid;             // Copies employee ID
        this.ename = e.ename;         // Copies employee name
        this.eprojects = new String[e.eprojects.length]; // Allocates new array for projects

        // Copies each project string individually to ensure deep copy
        for (int i = 0; i < e.eprojects.length; i++) {
            this.eprojects[i] = e.eprojects[i];
        }
    }

    // Parameterized constructor: initializes employee with given ID, name, and project list
    public Employee(String id, String name, String[] projects) {
        this.eid = id;
        this.ename = name;
        this.eprojects = projects; // Shallow copy of the array reference
    }

    // Method to display employee details
    public void display() {
        System.out.println("id:" + eid);       // Prints employee ID
        System.out.println("name:" + ename);   // Prints employee name
        System.out.println("projects:");       // Prints label for projects

        // Iterates through the project array and prints each project
        for (String s : eprojects) {
            System.out.print(s + ":");
        }
        System.out.print("\n"); // Moves to the next line after printing all projects
    }

    // Mutator method: modifies the employee's name and nullifies the first project
    public void mutator() {
        this.ename = "Mr " + this.ename; // Prefixes "Mr " to the employee's name
        this.eprojects[0] = null;        // Sets the first project to null
    }
}

// Main class
public class FClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner object for reading input

        String project[] = {"P001", "P002", "P003"}; // Predefined list of projects

        // Prompt user to enter employee ID
        String id = s.nextLine();

        // Prompt user to enter employee name
        String name = s.nextLine();

        // Create original employee object with user input and predefined projects
        Employee e1 = new Employee(id, name, project);

        // Create a deep copy of e1 using the copy constructor
        Employee e2 = new Employee(e1);

        // Modify e1's name and first project
        e1.mutator();

        // Display e2's details (should remain unchanged if deep copy is successful)
        e2.display();
    }
}
