import java.io.IOException;
import java.util.Scanner;

public class ATM {
    
    private Scanner in;
    private BankAccount activeAccount;
    private Bank bank;
    
    public static final int VIEW = 1;
    public static final int DEPOSIT = 2;
    public static final int WITHDRAW = 3;
    public static final int TRANSFER = 4;
    public static final int LOGOUT = 5;

    // public static final int INVALID = 0;
    // public static final int EXCESSIVE = 1;
    // public static final int INSUFFICIENT = 1;
    // public static final int SUCCESS = 2;

    public static final int FIRST_NAME_WIDTH = 20;
    public static final int LAST_NAME_WIDTH = 30;
    
    enum Transaction {
        INVALID,
        EXCESSIVE,
        INSUFFICIENT,
        SUCCESS;
    };
    
    public void startup() {
        System.out.println("Welcome to the AIT ATM!\n");
        
        while (true) {
            System.out.print("Account No.: ");
            String accountNoStr = in.next();
            
            if (accountNoStr.equals("+")) {
                System.out.print("First name: ");
                String firstname = in.next();
                System.out.print("Last name: ");
                String lastname = in.next();
                int pin;
                do {
                    System.out.print("PIN: ");
                    pin = in.nextInt();
                } while (pin < 1000 || pin > 9999);
                activeAccount = bank.createAccount(pin, new User(firstname, lastname));

                System.out.println("\nThank you. Your account number is " + activeAccount.getAccountNo() + ".");
                System.out.println("Please login to access your newly created account.");
                continue;
            }
            
            long accountNo = Long.parseLong(accountNoStr);
            System.out.println(accountNo);
            
            System.out.print("PIN        : ");
            int pin = in.nextInt();
            System.out.println(pin);

            // if (accountNo == -1 && pin == -1) {
            //     shutdown();
            // }

            if (isValidLogin(accountNo, pin)) {
                activeAccount = bank.login(accountNo, pin);
                System.out.println(activeAccount);
                System.out.println("\nHello, again, " + activeAccount.getAccountHolder().getFirstName() + "!\n");
                
                boolean validLogin = true;
                while (validLogin) {
                    switch (getSelection()) {
                        case VIEW:
                            showBalance();
                            break;
                        case DEPOSIT:
                            deposit();
                            bank.update(activeAccount);
                            break;
                        case WITHDRAW:
                            withdraw();
                            bank.update(activeAccount);
                            break;
                        case TRANSFER:
                            System.out.println("Transfer");
                            break;
                        case LOGOUT:
                            bank.save();
                            validLogin = false;
                            break;
                        default:
                            System.out.println("\nInvalid selection.\n");
                            break;
                    }
                }
            } else {
                if (accountNo == -1 && pin == -1) {
                    shutdown();
                } else {
                    System.out.println("\nInvalid account number and/or PIN.\n");
                    continue;
                }
            }
        }
    }
    
    public boolean isValidLogin(long accountNo, int pin) {
        return accountNo == activeAccount.getAccountNo() && pin == activeAccount.getPin();
    }

    
    public int getSelection() {
        System.out.println("[1] View balance");
        System.out.println("[2] Deposit money");
        System.out.println("[3] Withdraw money");
        System.out.println("[4] Transfer money");
        System.out.println("[5] Logout");
        
        return in.nextInt();
    }
    
    public void showBalance() {
        System.out.println("\nCurrent balance: " + activeAccount.getBalance());
    }
    
    public void deposit() {
        System.out.print("\nEnter amount: ");
        double amount = in.nextDouble();
        
        Transaction status = activeAccount.deposit(amount);
        if (status == ATM.Transaction.INVALID) {
            System.out.println("\nDeposit rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.Transaction.EXCESSIVE) {
            System.out.println("\nDeposit rejected. Amount would cause balance to exceed $999,999,999,999.99");
        } else if (status == ATM.Transaction.SUCCESS) {
            System.out.println("\nDeposit accepted.\n");
        }
    }
    
    public void withdraw() {
        System.out.print("\nEnter amount: ");
        double amount = in.nextDouble();
            
        Transaction status = activeAccount.withdraw(amount);
        if (status == ATM.Transaction.INVALID) {
            System.out.println("\nWithdrawal rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.Transaction.INSUFFICIENT) {
            System.out.println("\nWithdrawal rejected. Insufficient funds.\n");
        } else if (status == ATM.Transaction.SUCCESS) {
            System.out.println("\nWithdrawal accepted.\n");
        }
    }
    
    public void shutdown() {
        if (in != null) {
            in.close();
        }
        
        System.out.println("\nGoodbye!");
        System.exit(0);
    }
    
    /**
     * Constructs a new instance of the ATM class.
     */
    
    public ATM() {
        this.in = new Scanner(System.in);
        
        try {
			this.bank = new Bank();
		} catch (IOException e) {
			// cleanup any resources (i.e., the Scanner) and exit
		}
    }
    
    /*
     * Application execution begins here.
     */
    
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.startup();
    }
}
