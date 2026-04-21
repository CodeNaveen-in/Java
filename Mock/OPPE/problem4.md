Copy Constructor - Player Games
In a games event, Player p1 participates in a set of games. Player p2 also participates in all the games played by p1 except the second game, in place of which p2 participates in another game.

Write a program that defines two classes Player and Event. Define a copy constructor to create p2 from p1 such that changing the values of instance variables of either p2 or p1 does not affect the other one. The code takes the name of player p2 and the new game played by p2 as input.

Class Player should have:
Private instance variables String name and String[] games
Constructor(s) to initialize the instance variables
Accessor methods getName() and getGames(int) to get the name of the player and the game at a specific index
Mutator methods setName(String) and setGames(int, String) to set the name of the player and the game at a specific index
Class Event should:
Create two objects p1 and p2 (where p2 is created using p1)
Update the name of p2 and the second game played by p2 using input
Print the name of p1, p2 and the second game played by both
What You Have to Do
Define constructor(s) in class Player, including a copy constructor
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;

class Player {
    String name;
    String[] games;


    
    
    public Player(String n, String[] g) {
        name = n;
        games = g;
    }

    public Player(Player p) {
        this.name = p.name;
        this.games = new String[p.games.length];
        for (int i = 0; i < games.length; i++) {
            this.games[i] = p.games[i];
        }
    }
    

    public void setName(String n) {
        name = n;
    }

    public void setGames(int indx, String g) {
        games[indx] = g;
    }

    public String getName() {
        return name;
    }

    public String getGames(int indx) {
        return games[indx];
    }
}


public class Event {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] games = {"Throwball", "Javelin", "Volleyball"};
        Player p1 = new Player("Ranjit", games);
        Player p2 = new Player(p1);
        p2.setName(sc.next());
        p2.setGames(1, sc.next());
        System.out.println(p1.getName() + ": " + p1.getGames(1));
        System.out.println(p2.getName() + ": " + p2.getGames(1));
    }
}
```