//In Java, interfaces can inherit from other interfaces using the extends keyword.
//This is called interface inheritance.
//Interfaces do not use implements when inheriting other interfaces—only extends.

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    public void show() {
        A.super.show(); 
        B.super.show();
         // or override completely
    }
}

public class T17{
    public static void main(String[] args) {
        C c=new C();
        c.show();
    }
}
