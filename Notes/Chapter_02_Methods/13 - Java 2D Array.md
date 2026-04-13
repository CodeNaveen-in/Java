- Multidimensional array is an array of an array.
- It allows data to be stores in tabular form.

```java
public class Java2dArray {
    public static void main(String[] args) {

        // Declaring a 2D array
        int[][] arr;

        // Initializing row and column sizes
        arr = new int[1][3];

        // Assigning values
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 7;

        // Displaying values
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][2] = " + arr[0][2]);
        
		// Two dimensional array:  
		int[][] arr2d = new int[3][5];
		
		// Three dimensional array:  
		int[][][] arr3d = new int[3][5][7];
		
		int[][][] x = new int[3][5][7]; 
		//can store 3 × 5 × 7 = 105 elements.
    }
}
```

```java
public class AutoAddingArray
{
    public static void main(String[] args) {
      
      	// Row and Columns in Array
        int n = 2;
        int m = 2;

      	// Array declared and initialized
        int[][] arr = new int[n][m];

        int it = 1;
      
      	// Assigning the values to array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = it;
                it++;
            }
        }

      	// Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
```

```java
import java.util.Scanner;

public class Geeks 
{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);

      	// Taking Number of Rows and Columns from User
        System.out.print("Enter number of rows: ");
      	int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr= new int[row][col];

        System.out.println("Enter elements of array: ");

        // Taking input from user for each element of array using nested for loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

      
         System.out.println("Elements of array are: ");
      	// Printing Elements of Arrays
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
```

```java
import java.io.*;

class Java3dArray {
    public static void main(String[] args){
      
        int[][][] arr = new int[2][2][2];
      
      	// Three Dimensional x,y,z dimension
      	int n=arr.length;
        int m=arr[0].length;
      	int o=arr[0][0].length;
      
      	int it=1;
      
        // Assigning the values to array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              	for(int k=0; k < o; k++){
                	arr[i][j][k] = it;
                	it++;
                }
            }
        }

      	// Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
              for(int k=0; k < o; k++)
                	System.out.print(arr[i][j][k] + " ");
            	System.out.println();
            }
          	System.out.println();
        }
    }
}
```

# Jagged Arrays
- Arrays that are multi dimensional where each row can have a different number of columns.
- It's like a 2D array but each row with a different number of elements.

```java
class JaggedArray {
    public static void main(String[] args) {
        int r = 5;

        // Declaring 2-D array with 5 rows
        int arr[][] = new int[r][];

        // Creating a 2D array such that first row has 1 element, second row has two elements and so on
        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
```

```java
import java.util.Scanner;

public class JaggedArray2 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
      	System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scan.nextInt();
        
        // Declare the jagged array
        int[][] jaggedArray = new int[numberOfArrays][];
        
        // Allocate memory to each sub-array
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scan.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
        }
        
        // Initialize the elements of each sub-array
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
          
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scan.nextInt();
            }
        }
        
        // Print the elements of the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < numberOfArrays; i++) {
            
          	for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}
```

