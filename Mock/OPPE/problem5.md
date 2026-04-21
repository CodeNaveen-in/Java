Stock and Brokerage - Inheritance
An investment app maintains details of stock assets and their associated brokerage charges. The base class Stock has attributes for the stock name and its current price. The subclass BrokerageStock inherits from Stock and has an additional attribute for brokerage percentage.

Write a Java program that creates a BrokerageStock object and displays the stock’s name, price, and brokerage.

Class Stock has the following members:
Private instance variables String name and double price
Constructor to initialize the instance variables
Method toString() that returns a formatted string with stock name and price.
Class BrokerageStock should:
Inherit from Stock
Have a private instance variable double brokerage
Constructor to initialize the instance variables
Override toString() such that it uses the parent class’s toString() method and appends brokerage information to the returned string as given in the test cases.
Class InvestmentApp should:
Create an object of BrokerageStock using input values for name, price, and brokerage
Print the object
What you have to do
Define the constructor in class Stock
Define the toString() method in class Stock
Define the constructor in class BrokerageStock
Define the toString() method in class BrokerageStock
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api/

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.


```java
import java.util.*;

class Stock {
    private String name;
    private double price;


    
    
    public Stock(String n, double p){
        name = n;
        price = p;
    }

    public String toString(){
        return name + " price is " + price;
    }
    
}

class BrokerageStock extends Stock {
    private double brokerage;

    
    
    public BrokerageStock(String n, double p, double b){
        super(n, p);
        brokerage = b;
    }
    public String toString(){
        return super.toString() + ", Brokerage: " + brokerage;
    }
    
}


public class InvestmentApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double price = sc.nextDouble();
        double brokerage = sc.nextDouble();
        BrokerageStock s = new BrokerageStock(name, price, brokerage);
        System.out.println(s);
    }
}
```