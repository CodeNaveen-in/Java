import java.util.*;

// Engine class
class Engine implements Cloneable {
    String name;
    int numEngines;

    // Constructor
    Engine(String name, int numEngines) {
        this.name = name;
        this.numEngines = numEngines;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    // Clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // sufficient (only primitives + String)
    }

    // toString
    public String toString() {
        return "Engine Name: " + name + ", Count: " + numEngines;
    }
}


// Airplane class
class Airplane implements Cloneable {
    String company;
    Engine eng;
    String model;

    // Constructor
    Airplane(String company, Engine eng, String model) {
        this.company = company;
        this.eng = eng;
        this.model = model;
    }

    // Mutators
    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String name, int num) {
        eng.setName(name);
        eng.setNumEngines(num);
    }

    // Clone method (DEEP COPY)
    public Object clone() throws CloneNotSupportedException {
        Airplane cloned = (Airplane) super.clone();

        // Deep copy of Engine object
        cloned.eng = (Engine) this.eng.clone();

        return cloned;
    }

    // toString
    public String toString() {
        return "Company: " + company +
               ", Model: " + model +
               ", " + eng;
    }
}


// Test class
public class AirplaneCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);

        // Input for first airplane
        String company = sc.nextLine();
        String model = sc.nextLine();
        String engineName = sc.nextLine();
        int num = sc.nextInt();

        Engine e1 = new Engine(engineName, num);
        Airplane a1 = new Airplane(company, e1, model);

        // Clone a1 → a2
        Airplane a2 = (Airplane) a1.clone();

        sc.nextLine(); // consume newline

        // Modify a2
        String company2 = sc.nextLine();
        String model2 = sc.nextLine();
        String engineName2 = sc.nextLine();
        int num2 = sc.nextInt();

        a2.setCompany(company2);
        a2.setModel(model2);
        a2.setEngine(engineName2, num2);

        // Output
        System.out.println("Original Airplane:");
        System.out.println(a1);

        System.out.println("Cloned & Modified Airplane:");
        System.out.println(a2);
    }
}