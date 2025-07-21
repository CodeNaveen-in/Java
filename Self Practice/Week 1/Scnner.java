import java.util.Scanner;

public class Scnner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();          // Read a full line

        System.out.print("Enter your age: ");
        int age = sc.nextInt();               // Read an integer

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();         // Read a floating-point number

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        sc.close();   // Always close the scanner when done
    }
}
