/**
 * TOPIC: Inheritance & Runtime Polymorphism
 * CONCEPTS: Multilevel Inheritance, 'super' keyword, Method Overriding, 
 * and Upcasting (Polymorphic Arrays).
 */

import java.util.*;

// LEVEL 1: Grandparent Class
class Person {
    private String name;
    private long aadharno;

    public Person(String name, long aadharno) {
        this.name = name;
        this.aadharno = aadharno;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("aadharno : " + aadharno);
    }
}

// LEVEL 2: Parent Class (Inherits from Person)
class Employee extends Person {
    private double salary;

    public Employee(String name, long aadharno, double salary) {
        // super() calls the Person constructor to initialize name and aadharno
        super(name, aadharno);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print(); // Calls the print() method of Person
        System.out.println("salary : " + salary);
    }
}

// LEVEL 3: Child Class (Inherits from Employee)
class ContactEmployee extends Employee {
    // final static means this value is constant and shared by all instances
    final private static double hourlyPay = 100.00;
    private int contactHour;

    public ContactEmployee(String name, long aadharno, int contactHour) {
        // Calculate salary on the fly and pass it to Employee's constructor
        super(name, aadharno, contactHour * hourlyPay);
        this.contactHour = contactHour;
    }
    
    // Note: It doesn't override print(), so it uses Employee's print()
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nm1 = sc.nextLine();
        String nm2 = sc.nextLine();
        long adh1 = sc.nextLong();
        long adh2 = sc.nextLong();
        double sal = sc.nextDouble();
        int cont = sc.nextInt();

        // POLYMORPHISM IN ACTION
        // An array of type Employee can hold an Employee AND its subclasses (ContactEmployee)
        Employee[] eArr = new Employee[2];
        
        eArr[0] = new Employee(nm1, adh1, sal);
        eArr[1] = new ContactEmployee(nm2, adh2, cont);

        for(Employee e : eArr) {
            // JVM decides at RUNTIME which print() to call based on the actual object type
            e.print();
        }
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  IMPORTANT CONCEPTS FOR YOUR EXAM:

  1. MULTILEVEL INHERITANCE:
     Person -> Employee -> ContactEmployee. 
     A ContactEmployee "is-a" Employee, and also "is-a" Person.

  2. THE 'super' KEYWORD:
     - super(args): Calls the constructor of the immediate parent class. 
       It MUST be the first statement in a constructor.
     - super.method(): Calls the parent's version of a method before adding 
       new functionality in the child class.

  3. METHOD OVERRIDING:
     Employee provides its own version of the `print()` method. This allows 
     the program to display 'salary', which the Person class knows nothing about.

  4. UPCASTING & RUNTIME POLYMORPHISM:
     `eArr[1] = new ContactEmployee(...)` is upcasting. 
     When we call `e.print()`, even though the reference 'e' is of type Employee, 
     Java is smart enough to see the actual object is a ContactEmployee (or Employee) 
     and execute the correct logic.

  

  5. EXPECTED OUTPUT (If input: Alice, Bob, 111, 222, 50000, 10):
     name : Alice
     aadharno : 111
     salary : 50000.0
     name : Bob
     aadharno : 222
     salary : 1000.0 (Calculated as 10 hours * 100.00)

  6. WHY?
     - For Alice (Employee), it calls Employee's print().
     - For Bob (ContactEmployee), it calls Employee's print() because 
       ContactEmployee did not override it, but the salary was 
       pre-calculated in the constructor.
  --------------------------------------------------
*/