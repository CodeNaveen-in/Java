interface Toy {
    void play();
}

class ToyFactory {
    
    private class TeddyBear implements Toy {
        public void play() {
            System.out.println("Playing with teddy bear!");
        }
    }

    public Toy getToy() {
        return new TeddyBear(); 
    }
}

public class T15{
    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();
        Toy myToy = factory.getToy();  
        myToy.play();                  
    }
}
