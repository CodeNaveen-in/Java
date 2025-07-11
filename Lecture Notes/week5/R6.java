import java.lang.reflect.*;

class Parent {
    private String secret = "Hidden data";
    String name;
    private void privateMethod() {
        System.out.println("Inside Parent's private method");
    }
    public static void stMethod(){
        System.out.println("Static method");
    }
    public void get_secret(){
          System.out.println(secret);
    }
}

class Child extends Parent {
    // nothing here
    private void Hello(){}
    public int ChildMethod(){return 10;}

}

public class R6 {
    public static void main(String[] args) throws Exception {
        Child child = new Child();

        // No Parent.class used — only child.getClass().getSuperclass()
        Class<?> parentCls = child.getClass().getSuperclass();
        System.out.println("Parent class of child  "+parentCls);
        Class<?> ch=child.getClass();
        System.out.println("child class feilds");
        Field[] cf=ch.getFields();
        //above array is empty
        for(Field f :cf)System.out.println(f);
        // Access private field
        System.out.println("child class inherited feilds using parent class");
        Field secretField = parentCls.getDeclaredField("secret");
         //for(Field f :secretField)System.out.println(f);
        secretField.setAccessible(true);
        System.out.println("Secret: " + secretField.get(child));
        //child.get_secret()
        // Access private method
        Method privateMethod = parentCls.getDeclaredMethod("privateMethod");
        //static method
        Method stM=parentCls.getDeclaredMethod("stMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(child);
        //child.privateMethod();
        stM.invoke(child);
        Parent.stMethod();
        //obj.methods();
    }
}
