import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        // Polymorphism: A List of LibraryItems containing different sub-types
        List<LibraryItem> inventory = new ArrayList<>();
        
        inventory.add(new Book("Clean Code", "B001", "Robert Martin"));
        inventory.add(new DVD("Inception", "D992"));

        System.out.println("--- Processing Library Fines ---");
        
        for (LibraryItem item : inventory) {
            // At runtime, Java knows which calculateFine() to call!
            // This is "Dynamic Method Dispatch"
            item.calculateFine(5); 
        }
    }
}