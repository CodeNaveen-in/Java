public class WrapperBasics {
    public static void main(String[] args) {
        
        // Primitive/scalar to wrapper (Boxing)
        int a = 10;
        Integer boxA = Integer.valueOf(a); // Boxing
        Integer b=(Integer)a;
        System.out.println("Boxed Integer: " + boxA);

        // Wrapper to primitive (Unboxing)
        int unboxA = boxA.intValue(); // Unboxing
        System.out.println("Unboxed value: " + unboxA);

        // Autoboxing (automatic boxing)
        Integer autoBox = 20; // Java automatically converts int to Integer
        System.out.println("Autoboxed Integer: " + autoBox);

        // Auto-unboxing (automatic unboxing)
        int autoUnbox = autoBox; // Java automatically converts Integer to int
        System.out.println("Auto-unboxed value: " + autoUnbox);

        // Invalid casting (wrapper to different type) - this will cause error
        Integer x = 5;
        int w=10;
        double wd=(double)w;
        //Double y =(Double) x; // Uncommenting this will cause runtime error
        
        // Useful method from wrapper class
        String numberString = "123";
        String doubleString="1.234";
        Double d=Double.parseDouble(doubleString);
        int parsedNumber = Integer.parseInt(numberString); // Converts String to int
        double y = (double) parsedNumber;
        System.out.println("y "+y);
        System.out.println("Parsed number from string: " + parsedNumber);

        // Wrapper classes are required in collections
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        int z=45;
        list.add(z);

        list.add(100); // Autoboxing happens here
        list.add(200);
        System.out.println("ArrayList of Integers: " + list);
    }
}
