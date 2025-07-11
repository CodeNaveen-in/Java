class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    //getter
    public String getName() {
        return name;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String department) {
        super(name);
        this.department = department;
    }

    public void printDetails() {
        //System.out.println("Manager Name: "+name);
        System.out.println("Manager Name: " + getName());
        System.out.println("Department: " + department);
    }
}

public class Eg2 {
    public static void main(String[] args) {
        //dynamic dispatch
        Employee mgr1 = new Manager("Hiyaa", "Sales");
        Manager mgr2 = new Manager("Abhay", "Marketing");
        //mgr1.printDetails();
        mgr2.printDetails();
    }
}
