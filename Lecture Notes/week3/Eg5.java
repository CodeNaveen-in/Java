class Counter {
    //static belongs to a class 
    static int count = 0;

    Counter() {
        count++;
    }
    int x=12;
    static int getCount() {
        //System.out.println(x);
        return count;
    }
}

public class Eg5 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        

        System.out.println("Number of Counter objects created: " + Counter.getCount());
    }
}
