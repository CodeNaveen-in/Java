import java.util.ArrayList;
import java.util.List;

// Abstract class demonstrating ABSTRACTION
abstract class Person {
    // ENCAPSULATION: private field
    private String fullName;

    // Constructor to initialize common property
    public Person(String fullName) {
        this.fullName = fullName;
    }

    // Getter method for accessing private field
    public String getFullName() {
        return fullName;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract String getRole();
}

// INHERITANCE: Student extends Person
class Student extends Person {
    // ENCAPSULATION: private fields
    private int rollNumber;
    private List<Student> friends;

    // Constructor initializing fields
    public Student(int rollNumber, String fullName) {
        super(fullName); // calling parent constructor
        this.rollNumber = rollNumber;
        this.friends = new ArrayList<>();
    }

    // Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Returning a copy to protect internal list (ENCAPSULATION)
    public List<Student> getFriends() {
        return new ArrayList<>(friends);
    }

    // Method to add a friend
    public void addFriend(Student friend) {
        if (friend != null) { // null check to avoid errors
            friends.add(friend);
        }
    }

    // Method to remove a friend
    public void removeFriend(Student friend) {
        if (friend != null) {
            friends.remove(friend);
        }
    }

    // Check if a friend exists by name
    public boolean isFriendOf(String name) {
        for (Student friend : friends) {
            // null-safe comparison
            if (friend.getFullName() != null && friend.getFullName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // POLYMORPHISM: overriding abstract method
    @Override
    public String getRole() {
        return "Student";
    }

    // Overriding toString() for readable output
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber +
               ", Name: " + getFullName() +
               ", Friends Count: " + friends.size();
    }
}

public class StudentClass {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(3, "Charlie");

        // Adding friends
        s1.addFriend(s2);
        s1.addFriend(s3);

        // Printing student details
        System.out.println(s1);

        // Checking friendship
        System.out.println("Is Bob a friend? " + s1.isFriendOf("Bob"));

        // Removing a friend
        s1.removeFriend(s2);
        System.out.println("After removal:");
        System.out.println(s1);

        // POLYMORPHISM: using parent reference
        Person p = s1;
        System.out.println("Role: " + p.getRole());
    }
}