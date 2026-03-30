import java.util.Scanner;

public class ArrayOperate{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the list size you want: ");
	int num = scanner.nextInt();
	int[] arr = new int[num];

	for (int i=0; i<num; i++) {
		int new_num = scanner.nextInt();
		arr[i] = new_num;
		}
	System.out.println ("Your array is : ");
	for (int j=0; j<arr.length; j++) {
		if (j == 0) {
			System.out.print("[");
		} if (j < arr.length){
			System.out.print(arr[j]);
			if (j != arr.length-1){
				System.out.print(" , ");
			}
		} if (j == arr.length-1) {
			System.out.print("]");
		}
		}
	System.out.println();
	System.out.println("Want to find a num via index? (y/n): ");
	char choice = scanner.next().charAt(0);

	switch(choice) {
		case('y') : 
			System.out.print("Enter your number : ");
			int search = scanner.nextInt();
			for (int k=0; k<arr.length; k++) {
				if (search == arr[k]) {
					System.out.println ("The number " +search + " is present at the location " + k);
					 }
				}
		case ('n') :
			System.out.print("Okay as you wish.");
	}
	}
}
