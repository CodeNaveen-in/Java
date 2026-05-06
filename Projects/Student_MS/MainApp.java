package com.edu;
import com.edu.models.*;
import com.edu.services.FileService;

public class MainApp {
    public static void main(String[] args) {
        Address home = new Address("New York");
        Student original = new Student("Alice", 20, home);

        // 1. Demonstrate Deep Cloning
        Student twin = original.clone();
        twin.clone(); // Separate object in memory
        
        // Changing the twin's city won't affect Alice because of Deep Cloning
        // (If we used Shallow Cloning, Alice would move to Boston too!)
        // twin.getAddress().setCity("Boston"); 

        // 2. Demonstrate Persistence
        String file = "student_data.ser";
        FileService.saveStudent(original, file);

        // 3. Load it back
        Student loadedStudent = FileService.loadStudent(file);
        System.out.println("Loaded data: " + loadedStudent);
    }
}