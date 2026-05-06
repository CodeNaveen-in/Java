package com.edu.models;
import java.io.Serializable;

public class Address implements Serializable, Cloneable {
    private String city;

    public Address(String city) { this.city = city; }
    public void setCity(String city) { this.city = city; }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public String toString() { return "City: " + city; }
}