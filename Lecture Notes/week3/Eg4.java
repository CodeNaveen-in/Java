
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    //override toString from Object class
    public String toString(){
        return "Name: "+name+ " id: "+id;
    }

   //override from Object class
    public boolean equals(Object o) {
        //public boolean equals(Object o=class(employee, manager))
        if (this == o) return true;
        if (!(o instanceof Employee)) return false; //E1, M1
        Employee emp = (Employee) o;
        //return this.id == emp.id && name.equals(emp.name);
        return id == emp.id && name==emp.name;

        //1==1, string1=strnig2
}

}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id); 
        this.department = department;
    }

    
    
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false; 
        //another way
        if(!(o instanceof Manager)) return false;
        //if (getClass() != o.getClass()) return false;
        Manager m = (Manager) o;
        return department.equals(m.department); 
    }
}

public class Eg4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Harry", 101);
        Employee e2 = new Employee("Harry", 101);
        Manager m1 = new Manager("Ron", 102, "HR");
        Manager m2 = new Manager("Ron", 102, "HR");

        //call the toString
        System.out.println(e1); 
        System.out.println(m1.toString()); 
        System.out.println(m1);

       
        System.out.println(e1.equals(e2)); //F
        System.out.println(m1.equals(m2)); //T
        System.out.println(e1.equals(m1)); //F
    }
}
