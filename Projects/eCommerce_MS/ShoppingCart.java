import java.util.*;

public class ShoppingCart<T extends Product> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added to cart: " + item.getName());
    }

    public double calculateSubtotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    // Accepts a callback (Strategy) to process the final price
    public double checkout(DiscountStrategy strategy) {
        double subtotal = calculateSubtotal();
        return strategy.applyDiscount(subtotal);
    }
}

public class Electronics extends Product {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getPrice() {
        return basePrice + 15.00; // Flat $15 luxury tax
    }
}

public class Clothing extends Product {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getPrice() {
        return basePrice; // Standard pricing
    }
}