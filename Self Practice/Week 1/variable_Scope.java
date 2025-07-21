public class variable_Scope {
    
    // 🔵 Class variable (static, shared across all instances)
    static String appName = "VariableScopeVisualizer";

    // 🟢 Instance variable (each object has its own copy)
    String userName;

    // Constructor with parameter variable
    public variable_Scope(String name) {
        // 🟠 Parameter variable: 'name'
        userName = name; // used to set instance variable
    }

    // Method demonstrating local variables
    public void showDetails() {
        // 🔴 Local variable: only available inside this method
        int userScore = 100;

        System.out.println("App Name: " + appName);         // Class variable
        System.out.println("User Name: " + userName);       // Instance variable
        System.out.println("User Score: " + userScore);     // Local variable
    }

    public static void main(String[] args) {
        // Create an object and pass parameter to constructor
        variable_Scope demo = new variable_Scope("Alice");

        // Call method that shows variable values
        demo.showDetails();
    }
}
