Write a Java code that gives a simple demonstration of how a payment app processes a payment request of a specific amount. The payment app initiates the transfer after checking the balance, and prints whether the transaction is successful or not. The code uses the concepts of inner classes in Java, and has the following components:

Interface Transferable with an abstract method transfer().
Class PaymentApp has the following:
Instance variable accno of type String; it holds the account number for a specific Account object
Constructor to initialize accno.
an inner private class Account that has / does the following:
balance, amount as instance variables that hold the account balance and the amount to be transferred, respectively.
implements interface Transferable which enables its object to be accessible from outside the class PaymentApp.
constructor Account(double a) assigns the value a to amount and initializes balance to 1000.
method public String transfer() checks whether balance is less than amount. If it is, then it returns the string "Failed transaction", else it returns "Money debited current balance is <balance amount>"
method payRequest(double) that takes the amount to be transferred as an argument and returns a Transferable object on which the method transfer() can be invoked.
Class User has method main that does the folowing:
creates an object of PaymentApp with specific accno. Using this object, it invokes method payRequest() to obtain a Transferable object and invoke the method transfer on it.
What you have to do

Define method payRequest(double) in class PaymentApp
Java documentation can be accessed at:
https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

```java
import java.util.*;
interface Transferable {
    public abstract String transfer();
}

class PaymentApp {
    String accno;
    
    public PaymentApp(String n) {
        accno = n;
    }
    
    private class Account implements Transferable {
        double amount;
        double balance;

        public Account(double a) {
            amount = a;
            balance = 1000;
        }

        public String transfer() {
            if (balance < amount) {
                return "Failed transaction";
            }
                
            else {
                balance = balance - amount;
                return "Money debited current balance is " + balance;
            }
        }
    }


    
    // DEFINE method payRequest()
    
    public Transferable payRequest(double amt) { 
        return new Account(amt);
    }
    
   
}



public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentApp u1 = new PaymentApp("ACC101010");
        Transferable t1 = u1.payRequest(sc.nextDouble()); 
        System.out.println(t1.transfer());
    }
}
```