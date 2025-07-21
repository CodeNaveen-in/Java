// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class explicit_typecasting {
    public static void main(String[] args) {
        
        // 🔼 Explicit Upcasting: Dog → Animal
        Dog dogObj = new Dog();
        Animal animalRef = (Animal) dogObj;  // Upcasting (safe and often implicit)
        animalRef.makeSound();               // Calls method from Animal class

        // 🔽 Explicit Downcasting: Animal → Dog
        if (animalRef instanceof Dog) {
            Dog dogRef = (Dog) animalRef;   // Downcasting (requires instanceof check)
            dogRef.bark();                  // Calls method from Dog class
        } else {
            System.out.println("Downcasting not allowed!");
        }
    }
}