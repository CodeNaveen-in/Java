import java.util.*;

class Car {
    public String toString() {
        return "Generic Car";
    }
}

class Tesla extends Car {
    public String toString() {
        return "Tesla";
    }
}

class ModelS extends Tesla {
    public String toString() {
        return "Tesla Model S";
    }
}

public class Eg12{

    public static void addTeslas(List<? super Tesla> garage) {
        garage.add(new Tesla());
        garage.add(new ModelS());
        //garage.add(new Car());
        //ModelS s=new Tesla();
        Object o = garage.get(0);

        System.out.println("From garage: " + o);
    }

    public static void main(String[] args) {
        List<Car> carGarage = new ArrayList<>();
        List<Object> objGarage = new ArrayList<>();
        addTeslas(carGarage);
        addTeslas(objGarage);
    }
}
