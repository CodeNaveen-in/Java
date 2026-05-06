public abstract class Product {
    private String id;
    private String name;
    protected double basePrice;

    public Product(String id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double getPrice(); // Polymorphic pricing logic
    public String getName() { return name; }
    public String getId() { return id; }
}

@FunctionalInterface
public interface DiscountStrategy {
    double applyDiscount(double total);
}