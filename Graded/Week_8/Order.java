/**
 * TOPIC: Deep Cloning & The Cloneable Interface
 * CONCEPTS: Interface implementation, super.clone(), and handling nested object references.
 * GOAL: Create a total "hard copy" where changing the clone (c2) 
 * does not affect the original (c1).
 */

import java.util.*;

// 1. NESTED OBJECT CLONING
class Items implements Cloneable {
    public String[] item;

    public Items(String[] a) {
        // .clone() on an array creates a new array in memory
        this.item = a.clone();
    }

    @Override
    public Items clone() throws CloneNotSupportedException {
        // super.clone() performs a bitwise copy of the object
        Items it = (Items) super.clone();
        // CRITICAL: We must manually clone the array, or c1 and c2 will share it!
        it.item = (String[]) this.item.clone();
        return it;
    }

    public String toString() {
        String s = "";
        for(String val : item) {
            s = s + val + " ";
        }
        return s;
    }
}

// 2. PARENT OBJECT CLONING
class Customer implements Cloneable {
    String name;
    Items i;

    public Customer(String n, Items i) {
        this.name = n;
        this.i = i;
    }

    public Items getItems() { return this.i; }
    public void setName(String s) { name = s; }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        // Step A: Shallow copy of the Customer (name and reference to 'i')
        Customer c = (Customer) super.clone();
        
        // Step B: Deep copy of the 'Items' object
        // We call the clone() method we defined in the Items class
        Items nitem = this.i.clone();
        c.i = nitem;
        
        return c;
    }

    public String toString() {
        return name + " " + i;
    }
}

public class Order {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String[] itm = new String[n];
        for(int i = 0; i < n; i++) {
            itm[i] = sc.next(); 
        } 
        
        var c1 = new Customer("naresh", new Items(itm));
        
        // Perform the deep clone
        Customer c2 = c1.clone();   
        
        // Update c2 only
        c2.getItems().item[0] = sc.next();   
        c2.setName("suresh"); 

        // If Deep Cloning works, c1 should remain "naresh" with original items
        System.out.println(c1);
        System.out.println(c2);
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. SHALLOW COPY vs. DEEP COPY:
     - Shallow Copy: Only the references are copied. If 'c2' changes an item, 
       'c1' changes too.
     - Deep Copy: New memory is allocated for every nested object. 
       This is what this code achieves.

  

  2. THE CLONEABLE INTERFACE:
     A "Marker Interface" (it has no methods). By implementing it, 
     a class tells the JVM that the `Object.clone()` method is 
     allowed to be called on its instances.

  3. THE super.clone() METHOD:
     This is always the starting point. It creates the object structure, 
     then you manually copy the "tricky" parts (like arrays or other objects).

  4. EXPECTED OUTPUT (Input: 2, Pen Ink, Pencil):
     naresh Pen Ink 
     suresh Pencil Ink 

  5. WHY?
     Even though we updated `c2.item[0]` to "Pencil", the original `c1` 
     retained "Pen" because they are pointing to two different arrays 
     in memory thanks to the `it.item = (String[]) item.clone();` line.
  --------------------------------------------------
*/