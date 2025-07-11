//whatif for a class and interface 
class Parent {
    public void display() { System.out.println("Parent"); }
}

interface Displayable {
    default void display() { System.out.println("Interface"); }
}

class Child extends Parent implements Displayable {
    // Inherits display() from Parent; Parent wins over interface
    //public void display() { System.out.println("Child"); }

}
public class T8{
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
}
