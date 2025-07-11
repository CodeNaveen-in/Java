//private inner class
class OuterClass {
    private class InnerClass {
        void display() {
            System.out.println("Private Inner Class");
        }
    }

    void accessInner() {
        InnerClass inner = new InnerClass();
        inner.display();
        
    }
}

public class T10 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        //OuterClass.InnerClass inner = outer.new InnerClass();
        outer.accessInner(); // Output: Private Inner Class
    }
}

