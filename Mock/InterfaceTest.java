import java.util.*;  // Importing utility classes (Scanner used for input)

// Interface definition
interface Appraisable{

    // Default method (introduced in Java 8)
    // Provides a body inside interface
    default void appraisal(Teacher t){
        
        // Increase salary based on student pass percentage
        // (pass% / 100) * 5000 is added
        t.setSalary(t.getSalary() + (t.getstuPassPer()/100) * 5000);
    }

    // Abstract method (must be implemented by class)
    public abstract void checkAndUpdateSalary();
}

// Interface extending another interface (MULTIPLE INHERITANCE possible here)
interface SpecialAppraisable extends Appraisable{

    // Another default method
    default void spAppraisal(Teacher t){
        
        // Higher bonus than normal appraisal
        t.setSalary(t.getSalary() + (t.getstuPassPer()/100) * 10000);
    }
}

// Class implementing interface
class Teacher implements SpecialAppraisable{

    // Private data members (Encapsulation)
    private String name;
    private double salary;
    private double stuPassPer;  // student pass percentage

    // Constructor
    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for student pass percentage
    public double getstuPassPer() {
        return stuPassPer;
    }

    // toString() method (used when object is printed)
    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }

    // Implementation of abstract method from interface
    public void checkAndUpdateSalary() {

        // Decision making using if-else

        if(stuPassPer >= 60 && stuPassPer < 75)
            
            // Calls default method from Appraisable interface
            appraisal(this);

        else if(stuPassPer >= 75 && stuPassPer <= 100)
            
            // Calls default method from SpecialAppraisable interface
            spAppraisal(this);
     }
}

// Main class
public class InterfaceTest {

    // Static method to update and print teacher list
    public static void printUpdatedTeachList(Teacher[] tList) {

        // First loop → update salaries
        for (int i = 0; i < tList.length; i++)
            tList[i].checkAndUpdateSalary();

        // Second loop → print updated details
        for (int i = 0; i < tList.length; i++)
            System.out.println(tList[i]);  // Calls toString()
    }

    public static void main(String[] args) {

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Array of Teacher objects
        Teacher tArr[] = new Teacher[3];

        // Taking input for 3 teachers
        for (int i = 0; i < tArr.length; i++)
             tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());

        // Calling static method to process and print
        InterfaceTest.printUpdatedTeachList(tArr);
    }
}