//Generic classes are not covarient
import java.util.*;

public class Eg7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Iron Man", "Thor");
        List<Object> objects = names; 
        //this is not possible
        
    }
}
