import java.util.*;
public class R7 {
    public static void main(String[] args) {
        List<String> s=new ArrayList<String>();
        List<Integer> i=new ArrayList<Integer>();

        System.out.println(s.getClass());
        System.out.println(i.getClass());

    }
}


//static <T> method1(T name)//T->Object
//static <T extends Number> method2(T n)// T->Number