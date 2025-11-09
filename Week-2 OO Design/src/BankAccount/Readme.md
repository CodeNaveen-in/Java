# Create BankAccount class that has the following instance variables and methods:
Instance variables:
    accountNumber
    name
    balance
    final variable: minBalance
*Private method:*
    checkMinBalance(amount) - returns false if balance - amount <= minBalance else returns true

*Public methods:*

    balance( ) - prints the balance
    deposit(amount) - updates balance = balance + amount
    withdraw(amount) - calls the checkMinBalance(amount) method,
                                    if it returns true update balance = balance - amount else prints Transaction failed

## Example Execution:
If the user inputs:
```bash
200
950
```

- Deposit: 1000 + 200 = 1200
- Withdrawal: 1200 - 950 = 250 → allowed (since 250 > 100)
- Final balance: 250
If the user inputs:
```bash
200
1100
```

- Withdrawal would leave only 100 → not allowed
- Output: Transaction failed
