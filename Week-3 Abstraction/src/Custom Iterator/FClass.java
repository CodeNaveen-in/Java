import java.util.*; // Imports utility classes, including Scanner for user input

// Custom Iterator interface with two methods
interface Iterator {
    public boolean has_next();   // Checks if more elements are available
    public Object get_next();    // Returns the next element
}

// Sequence class that stores integers and provides an iterator
class Sequence {
    private final int maxLimit = 80; // Maximum capacity of the sequence
    private SeqIterator _iter = null; // Reference to the iterator
    int[] iArr;  // Array to store sequence elements
    int size;    // Current number of elements in the sequence

    // Constructor initializes the array and sets size to 0
    public Sequence(int size_) {
        iArr = new int[80]; // Fixed-size array (ignores size_ parameter)
        size = 0;
    }

    // Adds an element to the sequence
    public void addTo(int elem) {
        iArr[size] = elem; // Stores the element at the current index
        size++;            // Increments the size
    }

    // Returns an iterator for the sequence
    public Iterator get_Iterator() {
        _iter = new SeqIterator(); // Creates a new iterator instance
        return _iter;
    }

    // Inner class implementing the custom Iterator interface
    private class SeqIterator implements Iterator {
        int indx; // Tracks the current index in the sequence

        public SeqIterator() {
            indx = -1; // Starts before the first element
        }

        // Checks if there is a next element
        public boolean has_next() {
            return indx < size - 1;
        }

        // Returns the next element and advances the index
        public Object get_next() {
            return iArr[++indx];
        }
    }
}

// Main class to test the Sequence and Iterator
class FClass {
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5); // Creates a Sequence object (size_ is unused)
        Scanner sc = new Scanner(System.in); 

        // Reads 5 integers from the user and adds them to the sequence
        for (int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }

        // Gets an iterator and prints all elements in the sequence
        Iterator i = sObj.get_Iterator();
        while (i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}
