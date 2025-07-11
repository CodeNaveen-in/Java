import java.lang.reflect.Field;

class Student {
    String name = "Hiyaa";
    int age = 20;
    Student(){}
}

public class R5 {
    public static void main(String[] args) throws Exception {
        // Get Class object using .class
        Class<?> cls = Student.class;
        //class Student

        // Create object of Student using reflection
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Access and print fields using reflection
        Field nameField = cls.getDeclaredField("name");
        Field ageField = cls.getDeclaredField("age");

        // Get values from the object
        String name = (String) nameField.get(obj);
        int age = (int) ageField.get(obj);

        // Output
        System.out.println("Class Name: " + cls.getName());
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}



//Static <T extends Number> m1(T name)

//T becomes Number
//List<String> s1
//List<Integer> i1
//i1.getClass, s1.getClass
//












