class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    //overloading
    public double bonus(float percent) { return salary * percent / 100; }
    public double bonus() { 
        //return salary * 10 / 100;
        return bonus(10); 
    } // default 10%
}

class Manager extends Employee {
    private String secretary;

    public Manager(String name, double salary, String secretary) {
        super(name, salary);
        this.secretary = secretary;
    }

    public void setSecretary(String sec) { this.secretary = sec; }
    public String getSecretary() { return secretary; }


    @Override
    public double bonus(float percent) {
        System.out.println("from child class");
        return 1.5 * super.bonus(percent);
    }
}

public class Eg3 {
    public static void main(String[] args) {

        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Hiyaa", 50000);
        //dynamic dispatch
        staff[1] = new Manager("Abhay", 80000, "Riya");
        Employee e2=new Manager("harry", 10000,"Ron");
        
        /*for (Employee e : staff) {
            System.out.println(e.getName() + " bonus: " + e.bonus(5));
        }*/

        //pointer to staff[1] or the instance manager
        Employee e = staff[1];
        //e.setSecretary("Hiyaa");

        //type casting 

        if (e instanceof Manager) {
            Manager m = (Manager) e;
            m.setSecretary("Hiyaa");
            System.out.println(m.getName() + "'s secretary: " + m.getSecretary());
        }
    }
}
