interface Greetable {
    //default madatory to write
    default void greet() {
        System.out.println("Hello!");
    }
    //abstract void display();
}

class Person implements Greetable {
    //
    public void greet(){
        System.out.println("hello from Person");
    }
 }
// Person inherits greet() unless it overrides it.

public class T6 {
    
    public static void main(String[] args) {
        Person p=new Person();
        p.greet();
    }
}
