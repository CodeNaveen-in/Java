/**
 * TOPIC: The Iterator Design Pattern & Inner Classes
 * CONCEPTS: Interface implementation, Private Inner Classes, and State Traversal.
 * GOAL: To provide a way to access elements of a collection (Sequence) 
 * without exposing its underlying structure (the array).
 */

import java.util.*;

// 1. THE INTERFACE
// This defines the "contract" for any iterator. 
// It must be able to tell if there is more data and give the next item.
interface Iterator {
    public boolean has_next();
    public Object get_next();
}

class Sequence {
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;

    public Sequence(int size_) {
        // Note: The array is hardcoded to 80 regardless of 'size_'
        iArr = new int[maxLimit];
        size = 0;
    }

    public void addTo(int elem) {
        if (size < maxLimit) {
            iArr[size] = elem;
            size++;
        }
    }

    // Factory method to create a new iterator for this specific sequence
    public Iterator get_Iterator() {
        _iter = new SeqIterator();
        return _iter;
    }

    // 2. PRIVATE INNER CLASS
    // This class is HIDDEN inside Sequence. It has direct access to 'iArr' and 'size'.
    private class SeqIterator implements Iterator {
        int indx;

        public SeqIterator() {
            indx = -1; // Start before the first element
        }

        public boolean has_next() {
            // Checks if the next index is still within the number of added elements
            if (indx < size - 1)
                return true;
            return false;
        }

        public Object get_next() {
            // ++indx increments first, then accesses the array
            return iArr[++indx];
        }
    }
}

class IteratorDesign {
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in); 
        
        // Adding 5 elements to our sequence
        for(int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }

        // 3. POLYMORPHISM & ABSTRACTION
        // We get an Iterator, but we don't need to know it's a 'SeqIterator'.
        // We just treat it as the 'Iterator' interface.
        Iterator i = sObj.get_Iterator();
        
        while(i.has_next()) {
            System.out.print(i.get_next() + ", ");
        }
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. THE ITERATOR PATTERN:
     This pattern allows you to step through a collection (like our array) 
     one by one. It keeps the "cursor" logic (the `indx` variable) separate 
     from the data storage logic.

  2. INNER CLASSES:
     `SeqIterator` is a "Member Inner Class." Why use it?
     - It needs to access `iArr` and `size` which belong to the outer class.
     - By making it `private`, we hide the implementation details from the user.

  

  3. STATE MANAGEMENT:
     - `indx = -1`: The iterator starts in a "pre-start" position.
     - `has_next()`: Safely checks if moving forward will stay in bounds.
     - `++indx`: This is a "pre-increment" operator. It moves the cursor 
       forward and *then* returns the value at that new position.

  4. EXPECTED OUTPUT (If input: 10 20 30 40 50):
     10, 20, 30, 40, 50, 

  5. WHY?
     The `while` loop continues as long as `has_next()` is true. Each call to 
     `get_next()` moves the internal `indx` of the iterator forward until 
     it reaches the last element (size - 1).
  --------------------------------------------------
*/