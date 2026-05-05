import java.util.ArrayList;
import java.util.Scanner;

class Athlete implements Cloneable {
    private String athleteChestNum;
    private ArrayList<String> events;

    public Athlete() {
        athleteChestNum = "000";
        events = new ArrayList<String>();
        events.add("Relay");       // index 0
        events.add("Ind Evt 1");   // index 1
        events.add("Ind Evt 2");   // index 2
    }

    // Mutator method to set chest number
    public void setAthleteChestNum(String num) {
        this.athleteChestNum = num;
    }

    // Mutator to update individual event 1 (index 1)
    public void setIndividualEvt1(String evt1) {
        events.set(1, evt1);
    }

    // Mutator to update individual event 2 (index 2)
    public void setIndividualEvt2(String evt2) {
        events.set(2, evt2);
    }

    // Deep cloning method
    @Override
    public Object clone() throws CloneNotSupportedException {
        Athlete cloned = (Athlete) super.clone();
        cloned.events = new ArrayList<String>(this.events); // deep copy of list
        return cloned;
    }

    // Print object
    public String toString() {
        return athleteChestNum + " " + events;
    }
}

public class AthleteCloneTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Athlete dummyAthlete = new Athlete();

        try {
            Athlete a1 = (Athlete) dummyAthlete.clone();
            a1.setAthleteChestNum(sc.next());
            a1.setIndividualEvt1(sc.next());
            a1.setIndividualEvt2(sc.next());

            Athlete a2 = (Athlete) a1.clone();
            a2.setAthleteChestNum(sc.next());
            a2.setIndividualEvt1(sc.next());
            a2.setIndividualEvt2(sc.next());

            System.out.println("a1 " + a1);
            System.out.println("a2 " + a2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
