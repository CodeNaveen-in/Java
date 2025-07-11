public class Eg9 {
    public static <T extends Number> double average(T[] data) {
        double sum = 0.0;
        for (T val : data) {
            sum += val.doubleValue(); 
        }
        return sum / data.length;
    }

    public static void main(String[] args) {
        Integer[] scores = {80, 90, 100};
        Double[] readings = {10.5, 15.5, 20.0};
        String[] st={"hi","hello"};
        //System.out.println(average(st));
        Number[] num={1,2,3,4};
        System.out.println("Avg (Num): " + average(num));
        System.out.println("Avg (int): " + average(scores));
        System.out.println("Avg (double): " + average(readings));
    }
}
