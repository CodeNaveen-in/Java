import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number a : ");
        int a = scanner.nextInt();

        System.out.print("Enter your number b : ");
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Number a is : " + a);
        System.out.println("Number b is : " + b);
        System.out.println("Welcome to Java Calculator of 2 Integers");

        System.out.println("sum of a & b = " + sum);
        System.out.println("sub of a & b= " + sub);
        System.out.println("mul of a & b = " + mul);
        System.out.println("div of a & b = " + div);
    }
}