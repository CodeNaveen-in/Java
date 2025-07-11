class Box<T> {
    private T value;

    public void put(T val) {
        value = val;
    }

    public T get() {
        return value;
    }
}

public class Eg10 {
    // Accept any Box that can store Integer or its supertype
    public static <T> void add(Box<T> box, T val) {
        box.put(val);  
        System.out.println(box.get());
    }
    //Object super Integer
    // super Integer
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Number> numBox = new Box<>();
        Box<Integer> intBox = new Box<>();
        Box<String> stBox=new Box<>();
        add(objBox, "obj");  
        add(numBox, 3);  
        add(intBox, 2);
        add(stBox, "hello");

       
    }
}
