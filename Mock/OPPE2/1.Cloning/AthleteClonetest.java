import java.util.*;

// Athlete class
class Athlete implements Cloneable {

    String athleteChestNum;
    ArrayList<String> events;

    // Constructor
    Athlete(String chestNum, ArrayList<String> events) {
        this.athleteChestNum = chestNum;
        this.events = events;
    }

    // Mutator for chest number
    public void setChestNum(String chestNum) {
        this.athleteChestNum = chestNum;
    }

    // Mutator for individual events
    public void setIndividualEvents(String event1, String event2) {
        this.events.set(1, event1);
        this.events.set(2, event2);
    }

    // Clone method (Deep Copy)
    public Object clone() throws CloneNotSupportedException {
        Athlete cloned = (Athlete) super.clone();

        // Deep copy of ArrayList
        cloned.events = new ArrayList<>(this.events);

        return cloned;
    }

    // toString method
    public String toString() {
        return "Chest Number: " + athleteChestNum +
               ", Events: " + events;
    }
}


// Test class
public class AthleteCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);

        // Input relay event (common)
        String relayEvent = sc.nextLine();

        // Create dummy athlete
        ArrayList<String> events = new ArrayList<>();
        events.add(relayEvent);
        events.add("DummyEvent1");
        events.add("DummyEvent2");

        Athlete dummy = new Athlete("0", events);

        // Clone dummy → a1
        Athlete a1 = (Athlete) dummy.clone();

        // Clone a1 → a2
        Athlete a2 = (Athlete) a1.clone();

        // Input for a1
        String chest1 = sc.nextLine();
        String e1a = sc.nextLine();
        String e1b = sc.nextLine();

        a1.setChestNum(chest1);
        a1.setIndividualEvents(e1a, e1b);

        // Input for a2
        String chest2 = sc.nextLine();
        String e2a = sc.nextLine();
        String e2b = sc.nextLine();

        a2.setChestNum(chest2);
        a2.setIndividualEvents(e2a, e2b);

        // Output
        System.out.println(a1);
        System.out.println(a2);
    }
}