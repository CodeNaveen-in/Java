//example for interface inheritance multilevel
// Base interface
interface Vehicle {
    void start();
    void stop();
}

// Sub-interface that inherits from Vehicle
interface FourWheeler extends Vehicle {
    void turnOnAC();
}

// Concrete class that implements the sub-interface
class Car implements FourWheeler {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void turnOnAC() {
        System.out.println("AC is now ON");
    }
}

// Main class to run the program
public class T18 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();       // inherited from Vehicle
        myCar.turnOnAC();    // defined in FourWheeler
        myCar.stop();        // inherited from Vehicle
        FourWheeler c1=new Car();
        //c1.stop();
        //c1.turnOnAC();
        
    }
}
