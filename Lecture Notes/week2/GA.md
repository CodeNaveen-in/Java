# GA 1
```java
import java.util.*;
public class SeriesSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//Fill your code here
    long sum = 0;
    for (int i=1; i<=n; i++){
        for (int j=1; j<=i; j++){
            sum += j*j;
        }
    }
System.out.println(sum);
    
  }
}
```

# GA 2
```java
import java.util.Scanner;

class Employee{
	    String ename;
	    String eid;
	    String edept;
	    
	    public Employee(){
		        ename = "guest";
	    }
//Define the required methods
    public Employee(String name, String id, String dept){
        ename = name;
        eid = id;
        edept = dept;
    }
    public void copyDept(Employee e){
        this.edept = e.edept;
    }
    public void displayDetails(){
        System.out.println("ename : " + this.ename);
        System.out.println("eid : " + this.eid);
        System.out.println("edept : " + this.edept);
    }
}
public class FClass 
{
	    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
		        Employee e1 = new Employee();
		
		        //Enter name of the employee
		        String name = s.nextLine();
		
		        //Enter id of the employee
		        String id = s.nextLine();
		
		        //Enter department of the employee
		        String dept = s.nextLine();
		
		        Employee e2 = new Employee(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
	    }
}
```

# GA 3
```java
import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
 public Employee(String id, String name, String[] project){
     this.eid = id;
     this.ename = name;
     this.eprojects = project;
 }
 public Employee(Employee e){
     this.eid = e.eid;
     this.ename = e.ename;
     this.eprojects = e.eprojects;
 }
 public void display(){
     System.out.println("id:" + eid);
     System.out.println("name:" + ename);
     System.out.println("projects:");
     eprojects[0] = "P001";
     for (int i = 0; i < eprojects.length; i++){
         System.out.print(eprojects[i] + ":");
     }
 }
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class FClass
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
```