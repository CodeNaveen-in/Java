import java.util.*;  // Importing all utility classes (ArrayList, Map, Scanner, etc.)

// Class representing a Shop
class Shop{
    
    // Private data members (Encapsulation)
    private String name;
    private int nsold;  // number of items sold

    // Parameterized constructor
    public Shop(String s, int ns){
        this.name = s;   // initialize shop name
        this.nsold = ns; // initialize items sold
    }

    // Getter method for name
    public String getName(){
        return name;
    }

    // Getter method for number of items sold
    public int getItemSold(){
        return nsold;
    }
} 

// Main class
public class MapTest {

    // Static method to find shop with maximum items sold
    public static void printShopName(ArrayList<Shop> sList) {
        
        // Map to store shop name and total items sold
        // LinkedHashMap maintains insertion order
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();

        // Variables to track maximum
        String shop = "";  // store shop with max sales
        int sold = 0;      // store max value

        // Loop through ArrayList using for-each loop
        for(Shop s: sList)
            
            // getOrDefault:
            // If key exists → return its value
            // If not → return 0
            // Then add current sold items
            m.put(s.getName(), m.getOrDefault(s.getName(),0) + s.getItemSold());

        // Loop through Map entries
        for (HashMap.Entry<String, Integer> entry : m.entrySet()){
            
            // entry.getKey() → shop name
            // entry.getValue() → total items sold
            
            // Find maximum sold value
            if(entry.getValue() > sold) {
                
                shop = entry.getKey();     // update shop name
                sold = entry.getValue();   // update max value
            }  
        }

        // Print result
        System.out.println(shop + " : " + sold);
    }

    public static void main(String[] args) {
        
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // ArrayList to store Shop objects (Dynamic array)
        ArrayList<Shop> list = new ArrayList<Shop>();

        // Taking input for 4 shops
        for (int i = 0; i < 4; i++) {
            
            // Creating new Shop object and adding to list
            list.add(new Shop(sc.next(), sc.nextInt()));
        }

        // Calling method to process and print result
        printShopName(list);
    }
}