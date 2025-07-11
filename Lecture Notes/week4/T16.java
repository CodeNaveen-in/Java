//A callback is a mechanism where you pass a method (or behavior) to
// another object, and that method is called back later when something happens 
//(like an event is completed).

//Java doesn’t have function pointers, so callbacks are implemented using interfaces.
interface Toy {
    void play();
}

interface OnToyReady {
    void toyIsReady(Toy t);
}

class Customer implements OnToyReady {
    public void toyIsReady(Toy t) {
        System.out.println("Customer: Got the toy. Let's play!");
        t.play();
    }
}

class ToyFactory {
//private inner class
    private class TeddyBear implements Toy {
        public void play() {
            System.out.println("Playing with teddy bear!");
        }
    }

    public void makeToy(OnToyReady callback) {
        System.out.println("Factory: Making the toy...");
        Toy toy = new TeddyBear();
        callback.toyIsReady(toy);
    }
}

public class T16 {
    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();
        Customer customer = new Customer();
        factory.makeToy(customer);
    }
}
