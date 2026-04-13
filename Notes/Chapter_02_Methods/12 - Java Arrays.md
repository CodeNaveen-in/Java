- Array are a collection of element of the same type in contiguous memory locations.
- Array can hold both primitive type and Object type data.
- Array's 1st index is 0.
- after creating array it is fixed and we cannot change it.
- Array declaration is by *dataType[] arrayName; or dataType arrayName[]*
- Array initialisation is done by adding a size to the reference.
- Array's are good due to being : 
	- Memory Efficient
	- Efficient access
	- Data Organisation

```java
public class Array {
	public static void main(String[] args){
        // Primitive array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
	}
	
	public static void ArrayTypes {
		int arr[] = new int[size];
		int[] arr2 = {1,2,3,4};
	}
}
```

## Operations on Array Elements

### 1. Access elements
- Accessed by their position called index.
- Start from  0 and cannot be more than array size -1 or less then 0
- In case of index more than the length Java gives ArrayIndexOutOfBoundsException.

```java
class ArrayAccess {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print(arr[3] + " "); //4th element
		System.out.print(arr[0]); //first element
	}
}
```

### 2. Update elements
- Done by using assignment operator.
```java
class ArrayUpdate {
	public static void main(String[] args){
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		
		//updating 1st element
		arr[0] = 99;
		system.out.println(arr[0]);
	}
}
```

### 3. Traverse elements
- Done by going over every element one by one.
```java
class ArrayTraverse{
	public static void main(String[] args){
		int[] arr = {2,4,6,8,10};
		
		//Traversing and printing array
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
```

### 4. Size of array
- java works by using inbuilt length function
```java
public class ArraySize{
	public static void main(String[] args){
		int[] arr = {2,3,4,5,6,7,8,9};
		System.out.println("Size of array: " + arr.length);
	}
}
```

## Array of Objects
- Created like an array of primitive type data type

```java
class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ObjArray {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { " 
            + arr[i].roll_no + " " + arr[i].name + " }");
    }
}
```

### Passing Array to the methods

```java
public class ArrayMethod {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
```

### Getting Array from methods
```java
class ArrayReturn {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }
}
```
