import java.util.*; // Import utility classes like Scanner, Stack, and ArrayList

public class Test3 {

    // Method to check if the brackets in the input string are balanced
    public static boolean balanceCheck(String sequence) {
        Stack<Character> balancer = new Stack<Character>(); // Stack to track opening brackets

        for (int i = 0; i < sequence.length(); i++) {
            Character curr_char = sequence.charAt(i); // Get each character from the input

            // Skip characters that are not brackets
            if (curr_char != '(' && curr_char != '{' && curr_char != '[' &&
                curr_char != ')' && curr_char != '}' && curr_char != ']') {
                continue;
            }

            // If it's an opening bracket, push it onto the stack
            if (curr_char == '(' || curr_char == '{' || curr_char == '[') {
                balancer.push(curr_char);
                continue; // Move to next character after pushing
            }

            // If it's a closing bracket but stack is empty, it's unbalanced
            if (balancer.isEmpty()) {
                return false;
            }

            // Check for matching opening bracket and pop if matched
            if (curr_char == ')' && balancer.peek() == '(') {
                balancer.pop();
            } else if (curr_char == '}' && balancer.peek() == '{') {
                balancer.pop();
            } else if (curr_char == ']' && balancer.peek() == '[') {
                balancer.pop();
            } else {
                return false; // Mismatched bracket
            }
        }

        // If stack is empty, all brackets matched correctly
        return balancer.isEmpty();
    }

    // Main method: entry point of the program
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in); // Scanner to read user input

        ArrayList<String> expr_arr = new ArrayList<String>(); // List to store expressions
        String inp = null;

        // Keep reading expressions until user types "done"
        do {
            inp = s.nextLine();
            if (!inp.equalsIgnoreCase("Done")) {
                expr_arr.add(inp); // Add expression to the list
            }
        } while (!inp.equalsIgnoreCase("Done"));

        // Check each expression and print whether it's balanced
        for (String expr : expr_arr) {
            if (balanceCheck(expr)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
}
