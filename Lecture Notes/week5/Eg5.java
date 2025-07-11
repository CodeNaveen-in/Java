// Generic Copy with Type Constraint (Subtype to Supertype)
public class Eg5 {
    public static <S extends T,T> void copyArray(S[] src, T[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i]; // safe: S is a subtype of T
        }
    }

    public static void main(String[] args) {
        class Animal {}
        class Dog extends Animal {}
        Dog[] dogs = {new Dog(), new Dog()};
        Animal[] animals= new Animal[2];
        //Animal[] animals = {new Animal(), new Animal()};
        //Dog[] dogs = new Dog[2];

        copyArray(dogs, animals); // OK: Dog extends Animal
        //copyArray(animals,dogs);
    }
}
