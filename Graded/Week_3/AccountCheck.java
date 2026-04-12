/**
 * TOPIC: Encapsulation & Internal Validation
 * CONCEPTS: Private Helper Methods, Final Variables, and Logic Enforcement.
 * GOAL: Protect the object's state (balance) from reaching an invalid condition.
 */

import java.util.*;

class BankAccount {
    int accountNumber;
    String name;
    int balance;
    
    // 'final' means this value cannot be changed after initialization.
    // It acts as a constant for the bank's rules.
    final int minBalance = 100;

    /**
     * PRIVATE HELPER METHOD:
     * This is marked 'private' so it can only be used INSIDE this class.
     * The 'noob' user in the main method cannot call this directly.
     */
    private boolean checkMinBalance(int amount) {
        // Logic: Will this withdrawal leave us with less than the minimum?
        if (balance - amount <= minBalance) {
            return false; // Condition violated
        } else {
            return true;  // Condition safe
        }
    }

    public BankAccount(int a, String n, int b) {
        this.accountNumber = a;
        this.name = n;
        this.balance = b;
    }

    public void balance() {
        System.out.println(balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    /**
     * WITHDRAWAL LOGIC:
     * This method acts as a "gatekeeper". It calls the private 
     * helper method before deciding to subtract money.
     */
    public void withdraw(int amount) {
        if (checkMinBalance(amount)) {
            balance = balance - amount;
        } else {
            // If checkMinBalance returns false, we stop the transaction.
            System.out.println("Transaction failed");
        }
    }
}

class AccountCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input 1: Amount to deposit
        int amnt = sc.nextInt();
        // Input 2: Amount to withdraw
        int amnt1 = sc.nextInt();
        
        // Creating account with initial balance of 1000
        BankAccount b = new BankAccount(1890, "rahul", 1000);
        
        b.deposit(amnt);    // Step 1: Increase balance
        b.balance();        // Step 2: Show intermediate balance
        
        b.withdraw(amnt1);  // Step 3: Attempt withdrawal (Logic check happens here)
        b.balance();        // Step 4: Show final balance
        
        sc.close();
    }
}

/*
  --------------------------------------------------
  EXPLANATION FOR THE EXAM:

  1. ENCAPSULATION (Access Modifiers):
     The method `checkMinBalance` is 'private'. This is a key OOP concept. 
     The "outside world" (the main method) should not be able to check 
     the bank's internal rules; it should only call `withdraw()` and 
     let the class handle the rules internally.

  2. THE 'final' KEYWORD:
     The `minBalance` is marked `final`. In Java, this means it is a 
     constant. If you tried to write `minBalance = 50;` anywhere in 
     the code, the compiler would throw an error.

  3. LOGIC FLOW:
     The program uses a "Boolean Check" pattern. The helper method 
     answers a Yes/No question, and the main method uses an `if` 
     statement to act on that answer.

  

  4. TRACE (If Input: 500, 1400):
     - Initial: 1000
     - Deposit 500: Balance becomes 1500.
     - Withdraw 1400: 
       - Internal Check: (1500 - 1400) = 100.
       - Rule: Is (100 <= 100)? YES. 
       - checkMinBalance returns FALSE.
       - Result: "Transaction failed" is printed.

  5. EXPECTED OUTPUT (If Input: 500, 1400):
     1500
     Transaction failed
     1500

  6. WHY?
     Even though 1400 is less than 1500, the bank requires the balance 
     to stay STRICTLY ABOVE 100 (because the code says `<= minBalance`).
     If the balance hits exactly 100, the transaction fails.
  --------------------------------------------------
*/