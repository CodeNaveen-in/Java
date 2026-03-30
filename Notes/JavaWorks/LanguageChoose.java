import java.util.Scanner;

public class LanguageChoose {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome to Language Choose!");
	System.out.print(" Select your fav Langauge out of given : 1. Hindi, 2. English, 3. Kannada, 4. Finnish: ");
	char opt = scanner.next().charAt(0);
	
	switch(opt) {
		case 'H':
			System.out.println("Oh! Nice you like Hindi, why?");
			break;
		case 'E':
			System.out.println("English is always so versatile language, isn't?");
			break;
		case 'K':
			System.out.println("You like Kannada? Oh How nice!!!");
			break;
		case 'F':
			System.out.println("Finnish? Quiet Unique");
			break;
		}
	System.out.println("That is it from the program today!");
	}
}
