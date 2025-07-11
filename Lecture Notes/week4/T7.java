//whatif 2 interfaces with same func name
interface A { default void show() { System.out.println("A"); } }
interface B { default void show() { System.out.println("B"); } }

//interface A {  void show(); }
//interface B { void show(); }


class C implements A, B {
    
    //madatory to override default func inherited if more than 1 inplementation with same default func 
    public void show() {
        System.out.println("Resolved in MyClass");
    }
}

public class T7 {
    public static void main(String args[]){
        C c=new C();
        c.show();
    }
}
