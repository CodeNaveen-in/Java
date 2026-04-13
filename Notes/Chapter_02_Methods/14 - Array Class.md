- Array class is a class in Java that provides static methods to perform operations on arrays.
- It allows you to do utility based tasks : 
	- Static methods : sort(), binarySearch(), equals(), toString()
	- Extending objects

|Methods|Action Performed|
|---|---|
|[asList()](https://www.geeksforgeeks.org/java/arrays-aslist-method-in-java-with-examples/)|Returns a fixed-size list backed by the specified Arrays|
|[binarySearch()](https://www.geeksforgeeks.org/java/arrays-binarysearch-java-examples-set-1/)|Searches for the specified element in the array with the help of the Binary Search Algorithm|
|binarySearch(array, fromIndex, toIndex, key, Comparator)|Searches a range of the specified array for the specified object using the Binary Search Algorithm|
|[compare(array 1, array 2)](https://www.geeksforgeeks.org/java/java-arrays-compare-method-with-examples/)|Compares two arrays lexicographically: returns negative, 0, or positive if the first array is smaller, equal, or greater respectively.|
|[copyOf(originalArray, newLength)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.|
|[copyOfRange(originalArray, fromIndex, endIndex)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Copies the specified range of the specified array into a new Arrays.|
|[deepEquals(Object[] a1, Object[] a2)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Returns true if the two specified arrays are deeply equal to one another.|
|deepHashCode(Object[] a)|Returns a hash code based on the "deep contents" of the specified Arrays.|
|[deepToString(Object[] a)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Returns a string representation of the "deep contents" of the specified Arrays.|
|[equals(array1, array2)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Checks if both the arrays are equal or not.|
|[fill(originalArray, fillValue)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Assigns this fill value to each index of this arrays.|
|[hashCode(originalArray)](https://www.geeksforgeeks.org/java/importance-hashcode-method-java/)|Returns an integer hashCode of this array instance.|
|[mismatch(array1, array2)](https://www.geeksforgeeks.org/java/java-array-mismatch-method-with-examples/)|Finds and returns the index of the first unmatched element between the two specified arrays.|
|parallelPrefix(originalArray, fromIndex, endIndex, functionalOperator)|Performs parallelPrefix for the given range of the array with the specified functional operator.|
|[parallelPrefix(originalArray, operator)](https://www.geeksforgeeks.org/java/java-util-arrays-parallelprefix-java-8/)|Performs parallelPrefix for complete array with the specified functional operator.|
|[parallelSetAll(originalArray, functionalGenerator)](https://www.geeksforgeeks.org/java/java-util-arrays-parallelsetall-arrays-setall-java/)|Sets all the elements of this array in parallel, using the provided generator function.|
|[parallelSort(originalArray)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Sorts the specified array using parallel sort.|
|setAll(originalArray, functionalGenerator)|Sets all the elements of the specified array using the generator function provided.|
|[sort(originalArray)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Sorts the complete array in ascending order.|
|[sort(originalArray, fromIndex, endIndex)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Sorts the specified range of array in ascending order.|
|[sort(T[] a, int fromIndex, int toIndex, Comparator< super T> c)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Sorts the specified range of the specified array of objects according to the order induced by the specified comparator.|
|[sort(T[] a, Comparator< super T> c)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Sorts the specified array of objects according to the order induced by the specified comparator.|
|[spliterator(originalArray)](https://www.geeksforgeeks.org/java/arraylist-spliterator-method-in-java/)|Returns a Spliterator covering all of the specified Arrays.|
|spliterator(originalArray, fromIndex, endIndex)|Returns a Spliterator of the type of the array covering the specified range of the specified arrays.|
|[stream(originalArray)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|Returns a sequential stream with the specified array as its source.|
|[toString(originalArray)](https://www.geeksforgeeks.org/batch/skill-up-java/track/su-java-day10/article/MTM4MTMy)|It returns a string representation of the array, where elements are enclosed in square brackets [] and separated by a comma and a space.|
```java
import java.util.Arrays;

public class  {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        System.out.println(
            intKey
            + " found at index = "
            + Arrays
                  .binarySearch(intArr, 1, 3, intKey));
    }
}
```

# Final Array
- Final keyword makes a variable reference constant and not it's contents.
- You cannot reassign it to point to a new array

```java
// Main class
class ErrorArrayAssign {

    int p = 20;

    // Main driver method
    public static void main(String args[])
    {

        // Creating objects of above class
        final Geeks t1 = new Geeks();
        Geeks t2 = new Geeks();

        // Assigning values into other objects
        t1 = t2;

        System.out.println(t1.p);
    }
}
```

```java
class CorrectFinalAssign {
  
    int p = 20;
    public static void main(String args[])
    {
        final Geeks t = new Geeks();
        t.p = 30;
        System.out.println(t.p);
    }
}
```

| Operation                             | Allowed or Not | Explanation                                                 |
| ------------------------------------- | -------------- | ----------------------------------------------------------- |
| Modify element in final array         | Yes            | Array contents are mutable.                                 |
| Reassign final array to new array     | No             | The reference is final and it cannot point to a new object. |
| Modify object state in final variable | Yes            | Object fields can be updated.                               |
| Reassign final object reference       | No             | Final variables cannot point to new instances.              |
# Array Comparison

- **Bad practice** 
	- Don't use sort it modifies the array
	- Using == is also bad as it checks reference and not content
- Good practice 
	- Using traversal
	- Going to second last

```java
class Solution {
    public boolean isSorted(int[] arr) {
        // Handle null and trivially sorted arrays
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Traverse up to the second-last element to avoid index out of bounds
        for (int i = 0; i < arr.length - 1; i++) {
            // If a pair is found out of order, the array is not sorted
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // If no unordered pair is found, the array is sorted
        return true;
    }
}
```

```java
class Solution {
    public static int largest(int[] arr) {
        // Best way to find the max element of the array is traversal
        int max = arr[0];
        for (int i=0; i<=arr.length-1; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}

```