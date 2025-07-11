//to understand inner class
class OuterClass {
    private int x = 10;

    class InnerClass {
        int y = 5;
        void showSum() {
            System.out.println(x + y); // Accesses outer class member
        }
    }
}

public class T9 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        //to remember
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.showSum(); // Output: 15
    }
}
//create an instance of outer class
//using that instance we create an object of non private inner class