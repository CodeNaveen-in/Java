import java.util.*; // Imports utility classes including Scanner and ArrayList

// Class representing a cricket player
class CricketPlayer {
  private String name;     // Player's name
  private int wickets;     // Total wickets taken
  private int runs;        // Total runs scored
  private int matches;     // Total matches played

  // Constructor to initialize player details
  public CricketPlayer(String s, int w, int r, int m) {
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Getter for wickets
  public int getWickets() {
    return wickets;
  }

  // Getter for runs
  public int getRuns() {
    return runs;
  }

  // Calculates average runs per match
  public double avgRuns() {
    return runs / (double) matches;
  }

  // Calculates average wickets per match
  public double avgWickets() {
    return wickets / (double) matches;
  }
}

// Main class
public class Main {

  // Method to display names of bowlers and batters
  public static void displayPlayers(ArrayList<CricketPlayer> BW, ArrayList<CricketPlayer> BT) {
    for (CricketPlayer p : BW) {
      System.out.print(p.getName() + " "); // Print bowler names
    }
    System.out.println();

    for (CricketPlayer p : BT) {
      System.out.print(p.getName() + " "); // Print batter names
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read details for 4 players
    CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

    // Temporary list to hold all players
    ArrayList<CricketPlayer> temp = new ArrayList<CricketPlayer>();

    // Lists to hold batters and bowlers
    ArrayList<CricketPlayer> bt = new ArrayList<CricketPlayer>(); // Batters
    ArrayList<CricketPlayer> bw = new ArrayList<CricketPlayer>(); // Bowlers

    // Add all players to temp list
    temp.add(p1);
    temp.add(p2);
    temp.add(p3);
    temp.add(p4);

    // Classify players based on performance
    for (CricketPlayer p : temp) {
      if (p.avgRuns() > 25) {
        bt.add(p); // Add to batters if average runs > 25
      }
      if (p.avgWickets() > 1) {
        bw.add(p); // Add to bowlers if average wickets > 1
      }
    }

    // Display classified players
    displayPlayers(bw, bt);
  }
}
