/**
 * TOPIC: ArrayLists & Collections Framework
 * CONCEPTS: Dynamic Arrays (ArrayList), Object Filtering, and Integer Division.
 * GOAL: Grouping objects into different lists based on their calculated attributes.
 */

import java.util.*;

class CricketPlayer {
    private String name;
    private int wickets;
    private int runs;
    private int matches;

    public CricketPlayer(String s, int w, int r, int m) {
        this.name = s;
        this.wickets = w;
        this.runs = r;
        this.matches = m;
    }

    // GETTER METHODS: Used to access private data
    public String getName() { return name; }
    public int getWickets() { return wickets; }
    public int getRuns() { return runs; }

    /**
     * EXAM TRAP: Integer Division
     * Since 'runs' and 'matches' are both 'int', the result of (runs/matches) 
     * will be an integer (it cuts off decimals) before being turned into a double.
     */
    public double avgRuns() {
        return runs / matches; 
    }

    public double avgWickets() {
        return wickets / matches;
    }
}

public class Collections {
    // This method takes two ArrayLists as arguments
    public static void displayPlayers(ArrayList<CricketPlayer> BW, ArrayList<CricketPlayer> BT) {
        // For-each loop: Iterates through the list of Bowlers
        for (CricketPlayer p : BW) {
            System.out.print(p.getName() + " ");
        }
        System.out.println(); // New line
        
        // Iterates through the list of Batsmen
        for (CricketPlayer p : BT) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating 4 individual player objects
        CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        // ArrayLists are "Growable Arrays". They don't have a fixed size like p[]
        ArrayList<CricketPlayer> temp = new ArrayList<CricketPlayer>();
        ArrayList<CricketPlayer> bt = new ArrayList<CricketPlayer>();
        ArrayList<CricketPlayer> bw = new ArrayList<CricketPlayer>();

        temp.add(p1);
        temp.add(p2);
        temp.add(p3);
        temp.add(p4);

        // FILTERING LOGIC
        for (CricketPlayer p : temp) {
            if (p.avgRuns() > 25) {
                bt.add(p); // Add to Batsmen list
            }
            if (p.avgWickets() > 1) {
                bw.add(p); // Add to Bowlers list
            }
        }

        displayPlayers(bw, bt);
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. ARRAYLIST vs. ARRAY:
     - An Array `[]` is fixed in size once created.
     - An `ArrayList` is dynamic. You can `add()` or `remove()` items 
       whenever you want. It lives in the `java.util` package.

  

  2. OBJECT FILTERING:
     This code shows how one "Master List" (`temp`) can be used to populate 
     specialized lists (`bt`, `bw`). An object can exist in BOTH lists 
     if the player is an all-rounder!

  3. THE "INTEGER DIVISION" CAVEAT:
     In `runs / matches`, if a player has 51 runs in 2 matches:
     - Mathematical average: 25.5
     - Java result: 25.0
     This is because `int / int` always results in an `int`. To fix this, 
     you should use `(double) runs / matches`.

  4. EXPECTED OUTPUT (If Input: Naveen 10 300 10 ...):
     Naveen ... (if avgWickets > 1)
     Naveen ... (if avgRuns > 25)

  5. WHY?
     The program checks each player's stats. If they meet the criteria, 
     their "reference" is added to the relevant list. Finally, 
     `displayPlayers` prints the names from both categories.
  --------------------------------------------------
*/