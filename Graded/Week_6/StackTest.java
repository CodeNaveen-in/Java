/**
 * TOPIC: Data Structures - The Stack
 * CONCEPTS: LIFO (Last-In, First-Out), Stack Operations (push, pop, peek), 
 * and String Traversal.
 * GOAL: Verify if every opening bracket has a corresponding closing 
 * bracket in the correct order.
 */

import java.util.*;

public class StackTest {
    /**
     * THE BALANCING LOGIC:
     * Uses a Stack to keep track of opening brackets.
     */
    public static boolean balanceCheck(String sequence) {
        // Character is the wrapper class for 'char'
        Stack<Character> balancer = new Stack<Character>();
        
        for(int i = 0; i < sequence.length(); i++) {
            Character curr_char = sequence.charAt(i);
            
            // 1. FILTERING: If it's not a bracket, skip it
            if(curr_char != '(' && curr_char != '{' && curr_char != '[' && 
               curr_char != ')'&& curr_char != '}' && curr_char != ']') {
                continue;
            }

            // 2. OPENING BRACKETS: Push onto the stack
            if(curr_char == '(' || curr_char == '{' || curr_char == '[') {
                balancer.push(curr_char);
            } 
            
            // 3. CLOSING BRACKETS: Logic check
            else {
                // If we see a closing bracket but the stack is empty, it's unbalanced
                if(balancer.isEmpty())
                    return false;
                
                // Match the closing bracket with the most recent opening bracket (peek)
                else if(curr_char == ')') {
                    if(balancer.peek() != '(') return false;
                    else balancer.pop(); // Match found, remove it
                }
                else if(curr_char == '}') {
                    if(balancer.peek() != '{') return false;
                    else balancer.pop();
                }
                else if(curr_char == ']') {
                    if(balancer.peek() != '[') return false;
                    else balancer.pop();
                }
            }
        }
        // Final Check: If stack is empty, everything was matched perfectly
        return balancer.isEmpty();
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> expr_arr = new ArrayList<String>();
        String inp = null;
        
        // Dynamic Input: Keep taking lines until user types "Done"
        do {
            inp = s.nextLine();
            if(!inp.equalsIgnoreCase("Done"))
                expr_arr.add(inp);
        } while(!inp.equalsIgnoreCase("Done"));

        // Process each expression stored in the ArrayList
        for(String expr : expr_arr) {
            if(balanceCheck(expr)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
        s.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. THE STACK (LIFO):
     Think of a stack of plates. You add to the top (push) and take from the 
     top (pop). In this program, the last opening bracket we see MUST be 
     the first one to be closed.

  

  2. KEY STACK METHODS:
     - push(E item): Adds an item to the top.
     - pop(): Removes and returns the top item.
     - peek(): Looks at the top item without removing it.
     - isEmpty(): Returns true if the stack is empty.

  3. LOGIC FLOW:
     - If you see `(`: Push it.
     - If you see `)`: Check if the top of the stack is `(`. If yes, pop it. 
       If no (or if stack is empty), it's a mismatch!

  4. EXPECTED OUTPUT:
     Input:
     {[()]}
     ( [ ) ]
     Done
     
     Output:
     Balanced
     Not Balanced

  5. WHY?
     - For `{[()]}`: Stack grows `[ { , {[ , {[( ]`. Then as brackets close, 
       they match the top perfectly until the stack is empty.
     - For `([)]`: When `]` is encountered, the top of the stack is `(`, 
       not `[`. This is a sequence error, so it returns "Not Balanced".
  --------------------------------------------------
*/