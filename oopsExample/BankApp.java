
package oopsExample;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String pin;

    public BankAccount(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (enteredPin.equals(pin) && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance(String enteredPin) {
        return enteredPin.equals(pin) ? balance : -1;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String pin, double interestRate) {
        super(accountNumber, balance, pin);
        this.interestRate = interestRate;
    }

    public void addInterest(String pin) {
        double currentBalance = checkBalance(pin);
        if (currentBalance >= 0) {
            deposit(currentBalance * interestRate / 100);
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, String pin, double overdraftLimit) {
        super(accountNumber, balance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount, String enteredPin) {
        double currentBalance = checkBalance(enteredPin);
        if (currentBalance >= 0 && (currentBalance + overdraftLimit) >= amount) {
            return super.withdraw(amount, enteredPin); // clean use of parent
        }
        return false;
    }
}

class TransactionProcessor {
    public void processTransaction(BankAccount account, double amount, String pin) {
        if (account.withdraw(amount, pin)) {
            System.out.println("Transaction successful. Balance: " + account.checkBalance(pin));
        } else {
            System.out.println("Transaction failed.");
        }
    }
}

abstract class LoanAccount extends BankAccount {
    public LoanAccount(String accountNumber, double balance, String pin) {
        super(accountNumber, balance, pin);
    }

    // Force all loans to define repayment rule
    public abstract void repayLoan(double amount, String pin);
}

class HomeLoanAccount extends LoanAccount {
    public HomeLoanAccount(String accountNumber, double balance, String pin) {
        super(accountNumber, balance, pin);
    }

    @Override
    public void repayLoan(double amount, String pin) {
        super.deposit(amount);
        System.out.println("Repayment done for Home Loan.");
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S001", 1000, "1234", 5.0);
        BankAccount current = new CurrentAccount("C001", 2000, "1234", 500);
        LoanAccount homeLoan = new HomeLoanAccount("L001", 500000, "1234");

        TransactionProcessor tp = new TransactionProcessor();

        tp.processTransaction(savings, 200, "1234"); // Savings withdraw
        tp.processTransaction(current, 2500, "1234"); // Current overdraft
        homeLoan.repayLoan(10000, "1234"); // Loan repayment
    }
}
