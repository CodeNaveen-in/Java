public class typecasting {
    public static void main(String[] args) {
        
        // 🔸 Implicit Typecasting (Widening)
        int intValue = 100;
        long longValue = intValue;         // int → long
        float floatValue = longValue;      // long → float
        
        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);

        // 🔹 Explicit Typecasting (Narrowing)
        double doubleValue = 99.99;
        int narrowedInt = (int) doubleValue;   // double → int
        byte narrowedByte = (byte) narrowedInt; // int → byte

        System.out.println("\nExplicit Casting:");
        System.out.println("double to int: " + narrowedInt);
        System.out.println("int to byte: " + narrowedByte);

        // 🔹 Char and Integer Typecasting
        char charVal = 'A';
        int ascii = charVal;                // char → int
        char backToChar = (char) ascii;     // int → char

        System.out.println("\nChar ↔ Integer Casting:");
        System.out.println("char to int (ASCII): " + ascii);
        System.out.println("int to char: " + backToChar);
    }
}