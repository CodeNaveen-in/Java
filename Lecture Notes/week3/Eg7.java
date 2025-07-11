class A{
    static void f1(){
        System.out.println("hello A");
    }
}

class B extends A{
    static void f1(){
        System.out.println("hello b");
    }
}
public class Eg7 {
    public static void main(String[] args) {
        A a=new A();
        //a.f1();
        A b=new B();
        b.f1();
    }
}
