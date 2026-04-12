/**
 * TOPIC: Copy Constructors & Memory Management
 * CONCEPT: Deep Copy vs. Shallow Copy with Arrays.
 * GOAL: Creating a new object that is an independent clone of an existing one.
 */

import java.util.*;

class Employee {
    String eid;
    String ename;
    String eprojects[];

    // 1. THE COPY CONSTRUCTOR (Deep Copy Implementation)
    // This constructor takes another Employee object as a parameter.
    public Employee(Employee e) {
        this.eid = e.eid;      // Strings are immutable, so direct assignment is safe
        this.ename = e.ename;
        
        // DEEP COPY OF ARRAY:
        // We create a NEW array in memory so e2 doesn't point to e1's array.
        this.eprojects = new String[e.eprojects.length];
        for(int i = 0; i < e.eprojects.length; i++) {
            this.eprojects[i] = e.eprojects[i];
        }
    }

    // 2. PARAMETERIZED CONSTRUCTOR
    public Employee(String id, String name, String[] projects) {
        this.eid = id;
        this.ename = name;
        this.eprojects = projects;
    }

    public void display() {
        System.out.println("id:" + eid);
        System.out.println("name:" + ename);
        System.out.print("projects:");
        for(String s : eprojects) {
            System.out.print(s + ":");
        }
        System.out.print("\n");
    }

    // 3. THE MUTATOR METHOD
    // This "mutates" or changes the internal state of the object.
    public void mutator() {
        this.ename = "Mr " + this.ename;
        this.eprojects[0] = null; // Deleting the first project
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String project[] = {"P001", "P002", "P003"};
        
        String id = s.nextLine();   // e.g., "101"
        String name = s.nextLine(); // e.g., "Naveen"
        
        // Create original object e1
        Employee e1 = new Employee(id, name, project);
        
        // Create e2 as a COPY of e1
        Employee e2 = new Employee(e1); 
       
        // Change e1 only
        e1.mutator();
        
        // Check if e2 was affected by changes in e1
        e2.display();
        
        s.close();
    }
}

/*
  --------------------------------------------------
  IMPORTANT CONCEPTS FOR YOUR EXAM:

  1. COPY CONSTRUCTOR: 
     A constructor that initializes an object using another object of the same 
     class. It’s Java’s way of "cloning" without using the Cloneable interface.

  2. DEEP COPY (What this code does):
     Inside the copy constructor, the line `this.eprojects = new String[...]` 
     is crucial. It allocates NEW memory. If you simply did 
     `this.eprojects = e.eprojects`, both objects would share the same array. 
     That would be a "Shallow Copy."

  3. MUTABILITY:
     When `e1.mutator()` is called:
     - e1's name becomes "Mr Naveen".
     - e1's first project becomes null.
     - Because e2 is a DEEP COPY, e2's name stays "Naveen" and its projects 
       remain intact.

  

  4. EXPECTED OUTPUT (If input is 101 and Naveen):
     id:101
     name:Naveen
     projects:P001:P002:P003:

  5. WHY?
     Even though we modified e1 using the mutator, e2 was displayed. 
     Since the copy constructor performed a deep copy of the array and the 
     strings, the changes to e1 did not reflect in e2.
  --------------------------------------------------
*/