import java.text.NumberFormat;
import java.text.DecimalFormat;

// import ATM.Transaction;

public class BankAccount {
    
    private int pin;
    private long accountNo;
    private double balance;
    private User accountHolder;

    private DecimalFormat df = new DecimalFormat("#.00");
    
    public BankAccount(int pin, long accountNo, double balance, User accountHolder) {
        this.pin = pin;
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    
    public int getPin() {
        return pin;
    }
    
    public long getAccountNo() {
        return accountNo;
    }

    public String getBalance() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(balance);
    }

    public User getAccountHolder() {
        return accountHolder;
    }
    
    public ATM.Transaction deposit(double amount) {
        if (amount <= 0) {
            return ATM.Transaction.INVALID;
        } else if (Double.parseDouble(df.format(amount)) != amount) {
            return ATM.Transaction.FAULTY;
        } else if (balance + amount > 999999999999.99) {
            return ATM.Transaction.EXCESSIVE;
        } else {
            balance += amount;
        }
        return ATM.Transaction.SUCCESS;
    }
    
    public ATM.Transaction withdraw(double amount) {
        if (amount <= 0) {
            return ATM.Transaction.INVALID;
        } else if (Double.parseDouble(df.format(amount)) != amount) {
            return ATM.Transaction.FAULTY;
        } else if (amount > balance) {
            return ATM.Transaction.INSUFFICIENT;
        } else {
            balance -= amount;
        }
        return ATM.Transaction.SUCCESS;
    }

    public ATM.Transaction transfer(double amount, BankAccount transferAccount) {
        if (amount <= 0) {
            return ATM.Transaction.INVALID;
        } else if (Double.parseDouble(df.format(amount)) != amount) {
            return ATM.Transaction.FAULTY;
        } else if (amount > balance) {
            return ATM.Transaction.INSUFFICIENT;
        } else if (transferAccount.balance + amount > 999999999999.99) {
            return ATM.Transaction.EXCESSIVE;
        } else {
            balance -= amount;
            transferAccount.balance += amount;
        }
        return ATM.Transaction.SUCCESS;
    }
    
    /**
     * Formats the account balance in preparation to be written to the data file.
     * 
     * @return a fixed-width string in line with the data file specifications.
     */
    
    private String formatBalance() {
        return String.format("%1$15s", balance);
    }
    
    /**
     * Converts this BankAccount object to a string of text in preparation to
     * be written to the data file.
     * 
     * @return a string of text formatted for the data file
     */
    
    @Override
    public String toString() {
        return String.valueOf(accountNo) +
            String.valueOf(pin) +
            accountHolder.serialize() +
            formatBalance();
    }
}
