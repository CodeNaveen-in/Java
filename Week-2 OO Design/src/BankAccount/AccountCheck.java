import java.util.*; // Imports utility classes, including Scanner for user input

// Class representing a bank account
class BankAccount {
    int accountNumber; // Account number of the customer
    String name;       // Name of the account holder
    int balance;       // Current balance in the account
    final int minBalance = 100; // Minimum balance that must be maintained

    // Private method to check if withdrawal keeps balance above minimum
    private boolean checkMinBalance(int amount) {
        if (balance - amount <= minBalance) {
            return false; // Withdrawal would violate minimum balance
        } else {
            return true;  // Withdrawal is allowed
        }
    }

    // Constructor to initialize account details
    public BankAccount(int a, String n, int b) {
        this.accountNumber = a;
        this.name = n;
        this.balance = b;
    }

    // Method to display current balance
    public void balance() {
        System.out.println(balance);
    }

    // Method to deposit money into the account
    public void deposit(int amount) {
        balance = balance + amount;
    }

    // Method to withdraw money from the account
    public void withdraw(int amount) {
        if (checkMinBalance(amount)) {
            balance = balance - amount; // Deduct amount if allowed
        } else {
            System.out.println("Transaction failed"); // Print failure message
        }
    }
}

// Class to test the BankAccount functionality
class AccountCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        int amnt = sc.nextInt();  // Read deposit amount
        int amnt1 = sc.nextInt(); // Read withdrawal amount

        // Create a BankAccount object with initial balance of 1000
        BankAccount b = new BankAccount(1890, "rahul", 1000);

        b.deposit(amnt);   // Deposit the entered amount
        b.balance();       // Display balance after deposit

        b.withdraw(amnt1); // Attempt to withdraw the entered amount
        b.balance();       // Display balance after withdrawal
    }
}
