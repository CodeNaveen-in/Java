public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, String author) {
        super(title, id); // Calls the LibraryItem constructor
        this.author = author;
    }

    @Override
    public void calculateFine(int daysLate) {
        // Books are $0.50 per day late
        double fine = daysLate * 0.50;
        System.out.println("Fine for Book '" + title + "': $" + fine);
    }
}

public class DVD extends LibraryItem {
    public DVD(String title, String id) {
        super(title, id);
    }

    @Override
    public void calculateFine(int daysLate) {
        // DVDs are $2.00 per day late (higher demand!)
        double fine = daysLate * 2.00;
        System.out.println("Fine for DVD '" + title + "': $" + fine);
    }
}