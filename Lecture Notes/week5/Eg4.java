//Generic Array Copy – Same Type
public class Eg4 {
    public static <T> void copyArray(T[] src, T[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }

    public static void main(String[] args) {
        String[] source = {"A", "B", "C"};
        String[] target = new String[3];
        Eg4.copyArray(source, target);
        //copyArray(source,target);
        for (String s : target) {
            System.out.println(s); // A, B, C
        }
    }
}
