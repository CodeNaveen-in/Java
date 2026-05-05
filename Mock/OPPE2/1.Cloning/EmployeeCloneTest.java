import java.util.*;

// Address class
class Address implements Cloneable {
    String address;

    Address(String address) {
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return address;
    }
}


// Department class
class Department implements Cloneable {
    String dept;

    Department(String dept) {
        this.dept = dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return dept;
    }
}


// Person class
class Person implements Cloneable {
    String name;
    Address addr;

    Person(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public void setAddress(Address addr) {
        this.addr = addr;
    }

    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();

        // Deep copy of Address
        cloned.addr = (Address) this.addr.clone();

        return cloned;
    }

    public String toString() {
        return "Name: " + name + ", Address: " + addr;
    }
}


// Employee class
class Employee extends Person implements Cloneable {
    Department dept;

    Employee(String name, Address addr, Department dept) {
        super(name, addr);
        this.dept = dept;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    // Method to update both dept and address
    public void updateEmp(String newDept, String newAddr) {
        this.dept.setDept(newDept);
        this.addr.setAddress(newAddr);
    }

    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        // Deep copy of Department
        cloned.dept = (Department) this.dept.clone();

        return cloned;
    }

    public String toString() {
        return super.toString() + ", Department: " + dept;
    }
}


// Test class
public class EmployeeCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);

        // Input original employee
        String name = sc.nextLine();
        String address = sc.nextLine();
        String dept = sc.nextLine();

        Address addr = new Address(address);
        Department d = new Department(dept);

        Employee e1 = new Employee(name, addr, d);

        // Clone e1 → e2
        Employee e2 = (Employee) e1.clone();

        // Update clone
        String newAddr = sc.nextLine();
        String newDept = sc.nextLine();

        e2.updateEmp(newDept, newAddr);

        // Output
        System.out.println("Original Employee:");
        System.out.println(e1);

        System.out.println("Cloned & Updated Employee:");
        System.out.println(e2);
    }
}