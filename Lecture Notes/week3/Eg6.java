class A{
    final int x=12;
    final int y;
    A(){
         y=10;
    }
       
    
    void hello(){

        System.out.println("hello");
    }
    final void sayBye(){
        System.out.println("bye");
    }
}

class B extends A{
    void hello(){
        System.out.println("hello from class B");
    }
   
}
public class Eg6 {
    public static void main(String[] args) {
        B b=new B();
        b.sayBye();
    }
}
