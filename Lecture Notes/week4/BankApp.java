//controlled access using a private inner class + public interface
import java.util.Date;

//a Transaction Interface
interface Transaction {
    double checkBalance(String accountNumber, Date date);
}
class Bank {

    // Dummy login method
    public Transaction login(String username, String password) {
        if (isValid(username, password)) {
            return new TransactionHandler(); // give controlled access
        } else {
            return null; // access denied
        }
    }

    //dummy logic
    private boolean isValid(String username, String password) {
        return username.equals("Hiyaa") && password.equals("123");
    }

    class TransactionHandler implements Transaction {
        @Override
        public double checkBalance(String accountNumber, Date date) {
            System.out.println("Checking balance for account: " + accountNumber + " on " + date);
            return 10500.75; // dummy balance
        }
    }
}

// Main class to simulate user interaction
public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Transaction tx = bank.login("Hiyaa", "123");

        if (tx != null) {
            double balance = tx.checkBalance("AC123456", new Date());
            System.out.println("Your balance is: ₹" + balance);
        } else {
            System.out.println("Login failed. Access denied.");
        }
    }
}
