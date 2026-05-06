package com.edu.models;
import java.io.Serializable;

// Serializable: Allows the object to be converted to bytes
// Cloneable: A 'marker' interface that allows the use of clone()
public class Student implements Serializable, Cloneable {
    // serialVersionUID: Ensures version safety during loading
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;
    private Address address; // Nested object

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // DEEP CLONE: We manually clone the nested Address object
    @Override
    public Student clone() {
        try {
            Student cloned = (Student) super.clone();
            // Critical: If we don't clone 'address', both students 
            // will point to the exact same Address object in memory!
            cloned.address = this.address.clone(); 
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student: " + name + " | Age: " + age + " | " + address;
    }
}