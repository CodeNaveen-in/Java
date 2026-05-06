package com.edu.services;
import com.edu.models.Student;
import java.io.*;

public class FileService {
    
    public static void saveStudent(Student s, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(s);
            System.out.println("Student saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student loadStudent(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file: " + e.getMessage());
            return null;
        }
    }
}