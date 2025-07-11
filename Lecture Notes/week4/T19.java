//multiple interface inheritance
// Base interface 1
interface Vehicle {
    void start();
    void stop();
}

// Base interface 2
interface ElectricVehicle {
    void charge();
}

// Sub-interface inheriting both
//abstract class SmartVehicle implements Vehicle, ElectricVehicle{
interface SmartVehicle extends Vehicle, ElectricVehicle {
    abstract void autoDrive();
}

// Concrete class implementing the sub-interface
class TeslaModelX implements SmartVehicle {
    @Override
    public void start() {
        System.out.println("Tesla started");
    }

    public void stop() {
        System.out.println("Tesla stopped");
    }

    public void charge() {
        System.out.println("Tesla is charging");
    }

    public void autoDrive() {
        System.out.println("Tesla is driving autonomously");
    }
}

// Main class
public class T19 {
    public static void main(String[] args) {
        TeslaModelX myCar = new TeslaModelX();
       
        myCar.start();
        myCar.charge();
        myCar.autoDrive();
        myCar.stop();
    }
}
