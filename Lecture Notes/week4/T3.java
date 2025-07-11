//Interface
interface Animal {
    //static final public
    //static final public int num=12;
    int num=12;
    //int x;
    //abstract
    abstract void makeSound();
    void sleep();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
        System.out.println(Animal.num);
    }
    public void sleep(){
        System.out.println("sleeps!");
    }
}
public class T3{
    public static void main(String[] args){
        
       Animal a=new Dog();
       a.sleep();
       a.makeSound();
       System.out.println(Dog.num);
    
    }
}