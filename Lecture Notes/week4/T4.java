//multiple inheritance
//Java does not support multiple inheritance with classes, 
//but it allows multiple inheritance using:
//One abstract or concrete class
//Any number of interfaces
interface Flyable { 
    void fly();
 }
abstract class Swimmable { 
    abstract void swim(); 
}
//first parent class "exdends" then iterfaces "implements"

class Duck extends Swimmable implements Flyable {
    public void fly() { System.out.println("Duck flies."); }
    public void swim() { System.out.println("Duck swims."); }
}
public class T4{
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();
    }
}
