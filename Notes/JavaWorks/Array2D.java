public class Array2D {
	public static void main(String[] args) {
		int[][] arr2d = new int [][] { {1,2,3}, {4,5,6} };
		//Then we access it by jumping over the positions
		int num1 = arr2d[0][0];
		int num2 = arr2d[1][0];

		System.out.println("num 1 is 0th elem of 0th array : " + num1 + " and num2 is 0th elem of 1st array : " + num2);
	}
}
