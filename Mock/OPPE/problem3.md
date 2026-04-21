Copy Constructor - Student Courses
In a college, Student s1 chooses a set of courses. Student s2 also chooses all the courses chosen by s1 except the second course, in place of which s2 chooses another course.

Write a program that defines two classes Student and Admission. Define a copy constructor to create s2 from s1 such that changing the values of instance variables of either s2 or s1 does not affect the other one. The code takes name of student s2 and the new course chosen by s2 as input.

Class Student should have:
Private instance variables String name and String[] courses
Constructor(s) to initialize the instance variables
Accessor methods getName() and getCourses(int) to get the name of the student and the course at a specific index
Mutator methods setName(String) and setCourses(int, String) to set the name of the student and the course at a specific index
Class Admission should:
Create two objects of Student - s1 and s2 (where s2 is created using s1)
Update the name of s2 and the second course chosen by s2 using input
Print the name of s1, s2, and the second course chosen by s1 and s2
What You Have to Do
Define constructor(s) in class Student, including a copy constructor
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

class Student {
    String name;
    String[] courses;


    
    
    public Student(String n, String[] c) {
        name = n;
        courses = c;
    }

    public Student(Student s) {
        this.name = s.name;
        this.courses = new String[s.courses.length];
        for (int i = 0; i < courses.length; i++) {
            this.courses[i] = s.courses[i];
        }
    }
    

    public void setName(String n) {
        name = n;
    }

    public void setCourses(int indx, String c) {
        courses[indx] = c;
    }

    public String getName() {
        return name;
    }

    public String getCourses(int indx) {
        return courses[indx];
    }
}



public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"Maths", "DL", "DSA", "DC"};
        Student s1 = new Student("Nandu", courses);
        Student s2 = new Student(s1);
        s2.setName(sc.next());
        s2.setCourses(1, sc.next());
        System.out.println(s1.getName() + ": " + s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}
```