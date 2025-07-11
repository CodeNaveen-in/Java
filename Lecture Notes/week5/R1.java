import java.lang.reflect.*;

class Student {
    public String name;
    private int age;
    int star;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class R1 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Class<?> clazz = student.getClass();
        // class Student
        System.out.println(clazz);

        // Get public field and set its value
        Field nameField = clazz.getField("name");
        nameField.set(student, "Alice");

        //student.setName("alice");
        System.out.println("Public field value: " + nameField.get(student));
        //student.getter();
        // Get private field and set its value

        Field ageField = clazz.getDeclaredField("age");
        //student.age=10;
        ageField.setAccessible(true);
        ageField.set(student, 20);
        System.out.println("Private field value: " + ageField.get(student));

        System.out.println(student); // Prints: Student{name='Alice', age=20}
        Field[] f=clazz.getDeclaredFields();
        for(Field x:f){
            System.out.println(x);
        }
    }
}
//equals
//if o instance student
//.class to load it so i can start creating its obj idk its internal
//class.forName()