import java.lang.reflect.*;

class Product {
    private String name;
    private double price;

    public Product() { this("Default", 0.0); }
    public Product(String name) { this(name, 0.0); }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    public String toString() { return "Product{name='" + name + "', price=" + price + "}"; }
}

public class R2{
    public static void main(String[] args) throws Exception {
        Class clazz = Product.class;
        

        // Inspect all constructors
        Constructor[] constructors = clazz.getDeclaredConstructors();
        System.out.println("Constructors:");
        for (Constructor c : constructors) {
            System.out.println("  " + c);
        }

        // Create an instance using a constructor with arguments
        Constructor constructor = clazz.getDeclaredConstructor(String.class, double.class);
        Class[] paramTypes = constructor.getParameterTypes();
        System.out.println("Constructor parameter types:");
        for (Class<?> paramType : paramTypes) {
            System.out.println(paramType.getName());
        }
        Object product = constructor.newInstance("Laptop", 999.99);
        System.out.println("Created: " + product);

        // Invoke a method dynamically
        Method printInfo = clazz.getDeclaredMethod("printInfo");
        printInfo.invoke(product); // Output: Product: Laptop, Price: 999.99

        // Get all methods (including inherited)
        Method[] methods = clazz.getMethods();
        System.out.println("\nMethods:");
        for (Method m : methods) {
            System.out.println("  " + m);
        }
    }
}
