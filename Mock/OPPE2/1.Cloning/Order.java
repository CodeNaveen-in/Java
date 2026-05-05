import java.util.*;

class Items implements Cloneable {
    public String[] item;

    // Constructor to initialize item array
    public Items(String[] item) {
        this.item = new String[item.length];
        for (int i = 0; i < item.length; i++) {
            this.item[i] = item[i];
        }
    }

    // Clone method (deep copy)
    public Items clone() throws CloneNotSupportedException {
        Items cloned = (Items) super.clone();
        cloned.item = this.item.clone(); // deep copy of array
        return cloned;
    }

    // toString() for Items
    public String toString() {
        return String.join(" ", item);
    }
}

class Customer implements Cloneable {
    private String name;
    private Items items;

    // Constructor
    public Customer(String name, Items items) {
        this.name = name;
        this.items = items;
    }

    // Getter for Items
    public Items getItems() {
        return items;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Clone method (deep copy)
    public Customer clone() throws CloneNotSupportedException {
        Customer cloned = (Customer) super.clone();
        cloned.items = this.items.clone(); // deep copy of items
        return cloned;
    }

    // toString() for Customer
    public String toString() {
        return name + " " + items.toString();
    }
}

public class Order {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of items
        String[] itm = new String[n];
        for (int i = 0; i < n; i++) {
            itm[i] = sc.next(); // reading item names
        }

        // Create original customer c1
        Customer c1 = new Customer("naresh", new Items(itm));

        // Clone c1 to create c2
        Customer c2 = c1.clone();

        // Modify c2's first item and name
        c2.getItems().item[0] = sc.next(); // update first item
        c2.setName("suresh");

        // Output
        System.out.println(c1);
        System.out.println(c2);
    }
}