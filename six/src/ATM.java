import java.io.IOException;
import java.util.Scanner;

public class ATM {
    
    private Scanner in;
    private BankAccount activeAccount;
    private Bank bank;
    
    public static final int VIEW = 1;
    public static final int DEPOSIT = 2;
    public static final int WITHDRAW = 3;
    public static final int LOGOUT = 4;

    public static final int INVALID = 0;
    public static final int INSUFFICIENT = 1;
    public static final int SUCCESS = 2;

    public static final int FIRST_NAME_WIDTH = 20;
    public static final int LAST_NAME_WIDTH = 30;
    
    // public ATM() {
    //     in = new Scanner(System.in);
    //     // activeAccount = new BankAccount(1234, new User("Ryan", "Wilson"));
    // }
    
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
            
            System.out.print("PIN        : ");
            int pin = in.nextInt();

            if (accountNo == -1 && pin == -1) {
                System.out.println("\nGoodbye!");
                System.exit(0);
            }

            activeAccount = bank.login(accountNo, pin);
            
            if (isValidLogin(accountNo, pin)) {
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
        System.out.println("[4] Logout");
        
        return in.nextInt();
    }
    
    public void showBalance() {
        System.out.println("\nCurrent balance: " + activeAccount.getBalance());
    }
    
    public void deposit() {
        System.out.print("\nEnter amount: ");
        double amount = in.nextDouble();
        
        int status = activeAccount.deposit(amount);
        if (status == ATM.INVALID) {
            System.out.println("\nDeposit rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.SUCCESS) {
            System.out.println("\nDeposit accepted.\n");
        }
    }
    
    public void withdraw() {
        System.out.print("\nEnter amount: ");
        double amount = in.nextDouble();
            
        int status = activeAccount.withdraw(amount);
        if (status == ATM.INVALID) {
            System.out.println("\nWithdrawal rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.INSUFFICIENT) {
            System.out.println("\nWithdrawal rejected. Insufficient funds.\n");
        } else if (status == ATM.SUCCESS) {
            System.out.println("\nWithdrawal accepted.\n");
        }
    }

    public String createNewFirstName() { // for new account
        System.out.print("First name: ");
        return in.nextLine();
    }

    public String createNewLastName() { // for new account
        System.out.print("Last name: ");
        return in.nextLine();
    }

    public int createNewPIN() { // for new account
        System.out.print("PIN: ");
        return in.nextInt();
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
