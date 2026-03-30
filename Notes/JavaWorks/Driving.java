import java.util.Scanner;

public class Driving {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello to the Voting Page!");
		System.out.print("Enter your age : ");
		int age = scanner.nextInt();
		scanner.nextLine(); // clear buffer

		if (age < 18) {
			System.out.println("You don't need no license and the need to drive, kid");
		} else {
			System.out.print("Do you have license? (y/n) : ");
			char opt = scanner.next().charAt(0);

			if (opt == 'y') {
				System.out.println("Yes! Of course you can");
			} else if (opt == 'n') {
				System.out.println("No, please have a license");
			}
		}
	}
}