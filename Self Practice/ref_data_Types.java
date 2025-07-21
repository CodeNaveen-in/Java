import java.util.*; // for ArrayList and HashMap

// Interface
interface Greetable {
    void greet();
}

// Enum
enum Status {
    ACTIVE,
    INACTIVE,
    PENDING
}

// Class
public class ref_data_Types implements Greetable {
    String message;                       // String
    int[] numbers = {1, 2, 3};            // Array of integers
    ArrayList<String> list = new ArrayList<>(); // Collection
    HashMap<String, Integer> map = new HashMap<>(); // Collection
    Status status = Status.ACTIVE;       // Enum

    // Constructor
    public  ref_data_Types(String msg) {
        this.message = msg;
    }

    // Method from interface
    public void greet() {
        System.out.println("Greeting: " + message);
    }

    public void showDetails() {
        // Print Array
        System.out.println("Array contents:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Add to and print ArrayList
        list.add("Java");
        list.add("VS Code");
        System.out.println("\nArrayList contents: " + list);

        // Add to and print HashMap
        map.put("Apples", 3);
        map.put("Oranges", 5);
        System.out.println("HashMap contents: " + map);

        // Print Enum value
        System.out.println("Status: " + status);
    }

    // Main method
    public static void main(String[] args) {
        ref_data_Types demo = new ref_data_Types("Hello world!");
        demo.greet();
        demo.showDetails();
    }
}