/**
 * TOPIC: Functional Programming - Java Streams
 * CONCEPTS: Streams, Predicates (Filter), and Lambda Expressions (->).
 * GOAL: Use a declarative approach to query a list of objects based on multiple conditions.
 */

import java.util.*;
import java.util.stream.*; // Necessary for Stream classes

class Employee {
    private String name;
    private String dept;
    private int salary;

    public Employee(String n, String d, int s) {
        name = n;
        dept = d;
        salary = s;
    }

    // Standard Getters
    public String get_name() { return name; }
    public String get_dept() { return dept; }
    public int get_salary() { return salary; }

    @Override
    public String toString() {
        return name + " : " + dept + " : " + salary;
    }
}

class StreamJava {
    /**
     * THE STREAM QUERY:
     * eList.stream() converts the ArrayList into a data stream.
     * .filter() takes a Lambda expression to decide which items stay.
     */
    public static Stream<Employee> query(List<Employee> eList, String d, double s) {
        // 'n' represents each individual Employee object in the stream
        return eList.stream()
            .filter(n -> (n.get_dept().equals(d) && n.get_salary() >= s));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 'var' is a local variable type inference (introduced in Java 10)
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));

        String d = sc.next();    // e.g., "IT"
        double s = sc.nextInt(); // e.g., 60000

        // Execute the query
        var st = query(eList, d, s);

        // Terminal Operation: forEach performs an action on every element remaining in the stream
        st.forEach(n -> System.out.println(n + " "));
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. WHAT IS A STREAM?
     A Stream is not a data structure (it doesn't store data). It is a 
     sequence of elements from a source (like an ArrayList) that 
     supports aggregate operations.

  2. LAMBDA EXPRESSIONS (n -> ...):
     This is a short way to write an anonymous function. 
     - 'n' is the parameter (an Employee object).
     - '->' is the lambda operator.
     - The code to the right is the body/logic.

  

  3. PIPELINE OPERATIONS:
     - Intermediate Operation: `filter()` returns a new Stream. It is 
       "lazy," meaning it doesn't actually filter until a terminal 
       operation is called.
     - Terminal Operation: `forEach()` starts the processing and 
       produces a result (in this case, printing to the console).

  4. EXPECTED OUTPUT (If Input: IT 60000):
     Bella : IT : 60000 
     Jacob : IT : 70000 

  5. WHY?
     - "Nora" is IT but her salary (50000) is < 60000.
     - "James" has a high salary (80000) but is in "HR".
     - Only "Bella" and "Jacob" satisfy BOTH conditions in the filter.
  --------------------------------------------------
*/