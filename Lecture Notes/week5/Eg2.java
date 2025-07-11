// Generic reverse method
//Java supports generic programming using type variables like <T>. 
//These are used to write code that can work with any type while keeping type safety.
//generics don't work with primitive (scalar) types like int, char, double, etc., 
//because generics are designed to work only with objects — not raw primitive data types.

//<type-parameter> returnType methodName(parameters) { ... }

public class Eg2 {
    //public static type return type function_name(generic type variable)
    public static <T> T[] reverse(T[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] names = {"Harry", "Ron", "Jacob"};
        Integer[] numbers = {1, 2, 3, 4};//you can only use wrapper class not the primitive types

        names = reverse(names);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        numbers = reverse(numbers);
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
