// Abstract class: Cannot be instantiated. Defines the 'contract' for all items.
public abstract class LibraryItem {
    protected String title;
    protected String id;
    protected boolean isBorrowed = false;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    // Abstract method: Every item MUST implement its own borrowing logic
    public abstract void calculateFine(int daysLate);

    public void borrowItem() {
        isBorrowed = true;
        System.out.println(title + " has been checked out.");
    }

    public void returnItem() {
        isBorrowed = false;
        System.out.println(title + " has been returned.");
    }
}