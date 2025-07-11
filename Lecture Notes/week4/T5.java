//static default methods in interface, 
interface MathUtil {
    //by default x is final, static public attributes only
    int x=24;
    //below throws error
    //int y;
    static int square(int x) { return x * x; }
    //mandatory to write default below to define a default method
    default void Hello(){
        System.out.println("heloo");
    }
    //by default abstract
    void AbMethod();
}
class A implements MathUtil{
    public void AbMethod(){
        System.out.println("heloo A");
    }
}

public class T5 {
    public static void main(String[] args){
        int result = MathUtil.square(5); 
        System.out.println(result);
        A a=new A();
        a.Hello();
        a.AbMethod();

    }
}
