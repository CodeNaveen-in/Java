import java.util.*;  // Imports all utility classes (Scanner is used for input)

// Class definition (Blueprint for Employee objects)
class Employee{
    
    // Instance variables (data members)
    String name;        // Stores employee name
    String[] projects;  // Stores list of projects (array)

    // Parameterized Constructor
    // Used to initialize object with given values
    public Employee(String n, String[] proj){
        name = n;           // Assign name
        projects = proj;    // Assign array reference (SHALLOW COPY ⚠️)
    }

    // Copy Constructor
    // Used to create a new object by copying another object
    public Employee(Employee e){
        
        // Copying simple variable (String is immutable, so safe)
        this.name = e.name;

        // Getting length of original array
        int l = e.projects.length;

        // Creating a NEW array → important for deep copy
        this.projects = new String[l];

        // Copying each element one by one (DEEP COPY ✅)
        for(int i = 0; i < l; i++){
            this.projects[i] = e.projects[i];
        }
    }

    // Setter method for name (Encapsulation: controlled modification)
    public void setName(String n) {
        name = n;
    }

    // Setter method for project at a specific index
    public void setProject(int index, String proj) {
        projects[index] = proj;
    }

    // Getter method for name (Encapsulation: controlled access)
    public String getName() {
        return name;
    }

    // Getter method for project at given index
    public String getProject(int indx) {
        return projects[indx];
    }
}

// Main class (program execution starts here)
public class ConstructorTest {
    public static void main(String[] args) {
        
        // Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Creating and initializing array
        String[] proj =  {"PJ1", "PJ2", "PJ3"};

        // Creating object e1 using parameterized constructor
        Employee e1 = new Employee("Surya", proj);

        // Creating object e2 using copy constructor (DEEP COPY)
        Employee e2 = new Employee(e1);

        // Taking new values from user and modifying e2 only
        e2.setName(sc.next());        // Change name of e2
        e2.setProject(0, sc.next());  // Change first project of e2

        // Printing values of e1 (should remain unchanged)
        System.out.println(e1.getName() + ": " + e1.getProject(0));

        // Printing values of e2 (modified values)
        System.out.println(e2.getName() + ": " + e2.getProject(0));

        /*
        IMPORTANT CONCEPT (VERY COMMON IN EXAMS):

        - Parameterized constructor → SHALLOW COPY (array reference shared)
        - Copy constructor → DEEP COPY (new array created)

        If deep copy was NOT used:
            this.projects = e.projects;

        Then both e1 and e2 would share the same array.
        Changing e2 would ALSO change e1 ❌

        Because of deep copy:
        e1 and e2 are completely independent ✅

        Example Input:
        Ram
        NewProject

        Output:
        Surya: PJ1
        Ram: NewProject
        */
    }
}