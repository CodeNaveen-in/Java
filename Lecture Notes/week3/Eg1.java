class Employee {
    String name; //default
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    
    double calculateBonus() {
        return salary * 0.10; 
    }
}

class Manager extends Employee {
    
    String secretaryName; //managers attrbute

    
    Manager(String name, double salary, String secretaryName) {
        super(name, salary); 
        this.secretaryName = secretaryName;
    }

    //override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Secretary Name"+secretaryName);
    }
    

    
    //@Override
    double calculateBonus() {
        return salary * 0.20; 
    }
}


public class Eg1 {
    public static void main(String[] args) {
    
        Employee emp = new Employee("Hiyaa", 50000);
        System.out.println("Employee Info:");
        emp.displayInfo();
        //System.out.println("Bonus: $" + emp.calculateBonus());
        System.out.println();

       
        Employee mgr = new Manager("Dhanhanjay", 80000, "Abhay");
        System.out.println("Manager Info:");
        mgr.displayInfo();  
        //subtyping
        //Employee e2=new Manager(null, 0, null);

        //System.out.println("Bonus: $" + mgr.calculateBonus());
    }
}
