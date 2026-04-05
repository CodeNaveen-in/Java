import java.util.Scanner;  // Import Scanner class for user input

// Parent class (Base class)
class Faculty{
    
   // Private data members (Encapsulation)
   private String name;
   private double salary;

   // Parameterized constructor
   // Initializes name and salary
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }

   // Method to calculate bonus
   // percent is given as float
   public double bonus(float percent){
       return (percent/100.0)*salary;  
       // Example: if percent = 10 → returns 10% of salary
   }

   // Method Overloading (same method name, different parameters)
   // Version 1: No parameter
   public String getDetails() {
        return name + ", " + salary;
   } 

   // Version 2: With parameter (percent)
   public String getDetails(float percent ) {
        return getDetails()+ ", bonus = "+bonus(percent);
        // Calls bonus() method
   }
}

// Child class (Derived class) → INHERITANCE
class Hod extends Faculty{
    
    // Additional data member
    private String personalAssistant;

    // Constructor of child class
    public Hod(String name, double salary, String pa) {
        
        // Calls parent class constructor using super
        super(name, salary);
        
        // Initialize own variable
        this.personalAssistant = pa;
    }

    // Method Overriding (same method as parent, but different implementation)
    public double bonus(float percent){
        
        // Calls parent bonus method using super
        // HOD gets only 50% of the original bonus
        return 0.5 * super.bonus(percent);
    }

    // Overriding getDetails() (no parameter)
    public String getDetails() {
        
        // Calls parent method and adds extra info
        return super.getDetails()+", "+ personalAssistant;
    }

    // Overloading + Overriding combination
    public String getDetails(float percent ) {
        
        // Calls overridden getDetails() and adds bonus
        return getDetails()+", "+bonus(percent);
    } 
}

// Main class
public class InheritanceTest{
    public static void main(String[] args) {
        
        // Scanner object for input
        Scanner sc=new Scanner(System.in);

        // Creating Faculty object
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());

        // Creating HOD object but storing in Faculty reference
        // This is UPCASTING (Parent reference → Child object)
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());

        // Calling methods

        // For obj1 (Faculty object)
        System.out.println(obj1.getDetails());        // Calls Faculty getDetails()
        System.out.println(obj1.getDetails(10));      // Calls Faculty getDetails(float)

        // For obj2 (HOD object but Faculty reference)
        // Runtime Polymorphism happens here

        System.out.println(obj2.getDetails());        
        // Calls Hod getDetails() due to method overriding

        System.out.println(obj2.getDetails(10));      
        // Calls Hod getDetails(float) and overridden bonus()

        /*
        ================= IMPORTANT CONCEPTS =================

        1. INHERITANCE:
           Hod extends Faculty → reuse of code

        2. ENCAPSULATION:
           Private variables + public methods

        3. METHOD OVERLOADING:
           getDetails() and getDetails(float)

        4. METHOD OVERRIDING:
           bonus() and getDetails() in Hod class

        5. SUPER KEYWORD:
           super() → calls parent constructor
           super.method() → calls parent method

        6. RUNTIME POLYMORPHISM:
           Faculty obj2 = new Hod(...);
           Method call decided at runtime

        7. UPCASTING:
           Parent reference → Child object

        ================= SAMPLE INPUT =================
        Ram 50000
        Shyam 80000 Ravi

        ================= OUTPUT EXPLANATION =================
        obj1 → Faculty:
        Ram, 50000.0
        Ram, 50000.0, bonus = 5000.0

        obj2 → HOD:
        Shyam, 80000.0, Ravi
        Shyam, 80000.0, Ravi, 4000.0

        NOTE:
        - HOD bonus is HALF of Faculty bonus
        - So 10% of 80000 = 8000 → HOD gets 4000

        ======================================================
        */
    }
}