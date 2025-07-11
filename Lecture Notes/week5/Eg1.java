public class Eg1 {
    
    /*public static Object[] reverse(Object[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            Object temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    */
      public static String[] reverse(String[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] names = {"Harry", "Ron", "Jacob"};
        Object[] reversedNames = reverse(names); 
        for (Object s : reversedNames) {
            System.out.println(s); 
        }
        Object[] arr1={1,2,3,4, "abc", "qwr", 1.03}; //necglects homogenity
        Object[] arr2=reverse(arr1);
        for (Object s : arr2) {
            System.out.println(s); 
        }
        
        //int x=(int)arr1[1];//they use wrapper
        Integer x=(Integer) arr1[1];
        Object[] nums = {1, 4, 5, 6};
        //an object array
        Object[] reversedNums=reverse(nums); 
    }
}


