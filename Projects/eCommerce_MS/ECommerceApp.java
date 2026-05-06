public class ECommerceApp {
    public static void main(String[] args) {
        // 1. Setup Catalog (Collections)
        Map<String, Product> catalog = new HashMap<>();
        catalog.put("E01", new Electronics("E01", "Smartphone", 500.00));
        catalog.put("C01", new Clothing("C01", "Jeans", 40.00));

        // 2. Initialize Generic Cart
        ShoppingCart<Product> myCart = new ShoppingCart<>();
        myCart.addItem(catalog.get("E01"));
        myCart.addItem(catalog.get("C01"));

        // 3. Apply Discount via Callback (Strategy Pattern)
        // Scenario A: 10% Season Sale
        double finalPrice = myCart.checkout(total -> total * 0.90);
        
        // Scenario B: Flat $20 off (alternative strategy)
        // double finalPrice = myCart.checkout(total -> total - 20.0);

        System.out.println("Final Total after discount: $" + finalPrice);
    }
}