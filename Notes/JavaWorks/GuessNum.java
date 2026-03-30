import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = 13;
		int choice;

		do {
			System.out.println("Enter your number : ");
			choice = scanner.nextInt(); // take input here
			System.out.println(choice + " is your number");
		}
		while (choice != num);

		System.out.println("Correct! You guessed the number.");
	}
}