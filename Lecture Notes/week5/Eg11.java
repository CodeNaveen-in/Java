class Copier {
    
    public static <S extends T, T> void copy(S[] src, T[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i]; 
           

        }
    }

    public static void main(String[] args) {
        //number reference to integer
        Number[] src = {1, 2, 3};      
        Integer[] dest = new Integer[3]; 
        //number is a superclass
        copy(src, dest); 

        for (Integer n : dest) {
            System.out.println(n);
        }
    }
}
//go through 