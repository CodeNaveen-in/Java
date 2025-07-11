//wildcard
import java.util.*;
//Use <?> when you're just reading values and don’t care about the type.
public class Eg8 {
    //public static <T> void printAnything(List<T> list){
    public static void printAnything(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Double> ratings = Arrays.asList(4.5, 5.0);
        List<String> comments = Arrays.asList("Great!", "Loved it!");

        printAnything(ratings);
        printAnything(comments);
    }
}
