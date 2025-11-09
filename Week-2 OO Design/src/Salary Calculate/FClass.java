import java.util.*; // Imports utility classes including Scanner for user input

// Base class representing a person
class Person {
    private String name;       // Person's name
    private long aadharno;     // Person's Aadhar number (unique ID)

    // Constructor to initialize name and Aadhar number
    public Person(String name, long aadharno) {
        this.name = name;
        this.aadharno = aadharno;
    }

    // Method to print person's details
    public void print() {
        System.out.println("name : " + name);         // Prints name
        System.out.println("aadharno : " + aadharno); // Prints Aadhar number
    }
}

// Derived class representing an employee, inherits from Person
class Employee extends Person {
    private double salary; // Employee's salary

    // Constructor to initialize name, Aadhar number, and salary
    public Employee(String name, long aadharno, double salary) {
        super(name, aadharno); // Calls Person constructor
        this.salary = salary;
    }

    // Method to print employee details including inherited fields
    public void print() {
        super.print(); // Prints name and Aadhar number from Person
        System.out.println("salary : " + salary); // Prints salary
    }
}

// Derived class representing a contract-based employee
class ContactEmployee extends Employee {
    final private static double hourlyPay = 100.00; // Fixed hourly pay rate
    private int contactHour; // Number of hours worked

    // Constructor calculates salary based on hours and initializes fields
    public ContactEmployee(String name, long aadharno, int contactHour) {
        super(name, aadharno, contactHour * hourlyPay); // Calculates salary and calls Employee constructor
        this.contactHour = contactHour;
    }
}

// Main class containing the entry point
class FClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for reading input

        // Read name of first employee
        String nm1 = sc.nextLine();

        // Read name of second employee
        String nm2 = sc.nextLine();

        // Read Aadhar numbers
        long adh1 = sc.nextLong();
        long adh2 = sc.nextLong();

        // Read salary for first employee
        double sal = sc.nextDouble();

        // Read contact hours for second employee
        int cont = sc.nextInt();

        // Create an array to hold two Employee objects
        Employee[] eArr = new Employee[2];

        // Create a regular Employee object
        eArr[0] = new Employee(nm1, adh1, sal);

        // Create a ContactEmployee object (inherits from Employee)
        eArr[1] = new ContactEmployee(nm2, adh2, cont);

        // Loop through the array and print details of each employee
        for (Employee e : eArr)
            e.print(); // Calls overridden print method
    }
}
