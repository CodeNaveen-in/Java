class Hello {
    void greet() {
        System.out.println("Hello from object");
    }
}

public class R4 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Hello");  // Loads the class using a String name, 
        var obj = c.getDeclaredConstructor().newInstance();  // create object//write var or Object
        Hello h = (Hello)obj;
        h.greet();
    }
}
