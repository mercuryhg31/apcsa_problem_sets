import java.io.IOException;
import java.util.Scanner;

public class ATM {
    
    private Scanner in;
    private BankAccount activeAccount;
    private Bank bank;
    
    public static final int FIRST_NAME_WIDTH = 20;
    public static final int LAST_NAME_WIDTH = 30;
    
    enum Menu {
        VIEW,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        LOGOUT;
    }
    
    enum Transaction {
        INVALID,
        FAULTY,
        EXCESSIVE,
        INSUFFICIENT,
        SUCCESS;
    }
    
    public void startup() {
        System.out.println("Welcome to the AIT ATM!\n");
        
        while (true) {
            System.out.print("Account No.: ");
            String accountNoStr = in.next();

            if (accountNoStr.equals("+")) {
                newAccount();
                continue;
            }

            long accountNo = Long.parseLong(accountNoStr);

            System.out.print("PIN        : ");
            int pin = in.nextInt();

            activeAccount = bank.getAccount(accountNo);

            if (activeAccount != null && isValidLogin(accountNo, pin)) {
                activeAccount = bank.login(accountNo, pin);
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
                            transfer();
                            break;
                        case LOGOUT:
                            bank.save();
                            validLogin = false;
                            System.out.println();
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

    public Menu getSelection() {
        System.out.println("[1] View balance");
        System.out.println("[2] Deposit money");
        System.out.println("[3] Withdraw money");
        System.out.println("[4] Transfer money");
        System.out.println("[5] Logout");
        
        int selection = in.nextInt();
        switch (selection) {
            case 1:
                return ATM.Menu.VIEW;
                // break;
            case 2:
                return ATM.Menu.DEPOSIT;
                // break;
            case 3:
                return ATM.Menu.WITHDRAW;
                // break;
            case 4:
                return ATM.Menu.TRANSFER;
                // break;
            case 5:
                return ATM.Menu.LOGOUT;
                // break;
            default:
                return null;
        } // honestly, this is stupid at this point, but i'm committed i guess
    }
    
    public void showBalance() {
        System.out.println("\nCurrent balance: " + activeAccount.getBalance() + "\n");
    }
    
    public void deposit() {
        System.out.print("\nEnter amount: ");
        double amount = in.nextDouble();
        
        Transaction status = activeAccount.deposit(amount);
        if (status == ATM.Transaction.INVALID) {
            System.out.println("\nDeposit rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.Transaction.EXCESSIVE) {
            System.out.println("\nDeposit rejected. Amount would cause balance to exceed $999,999,999,999.99\n");
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

    public void transfer() {
        System.out.print("\nEnter account: ");
        long accountNo = in.nextLong();
        System.out.print("Enter amount: ");
        double amount = in.nextDouble();
        BankAccount transferAccount = bank.getAccount(accountNo);
        
        if (transferAccount == null) {
            System.out.println("\nTransfer rejected. Destination account not found.\n");
        } else if (transferAccount.getAccountNo() == activeAccount.getAccountNo()) {
            System.out.println("\nTransfer rejected. Destination account matches origin.\n");
        } else {
            Transaction status = activeAccount.transfer(amount, transferAccount);
            if (status == ATM.Transaction.INVALID) {
                System.out.println("\nTransfer rejected. Amount must be greater than $0.00.\n");
            } else if (status == ATM.Transaction.INSUFFICIENT) {
                System.out.println("\nTransfer rejected. Insufficient funds.\n");
            } else if (status == ATM.Transaction.EXCESSIVE) {
                System.out.println("\nTransfer rejected. Amount would cause destination balance to exceed $999,999,999,999.99.\n");
            } else if (status == ATM.Transaction.SUCCESS) {
                System.out.println("\nTransfer accepted.\n");
            }
        }
    }

    public void newAccount() {
        System.out.print("\nFirst name: ");
        String firstName = in.next();
        while (firstName.length() < 1 || firstName.length() > 20) {
            System.out.print("Invalid name, try again: ");
            firstName = in.next();
        }

        System.out.print("Last name: ");
        String lastName = in.next();
        while (lastName.length() < 1 || lastName.length() > 30) {
            System.out.print("Invalid name, try again: ");
            lastName = in.next();
        }

        System.out.print("PIN: ");
        int pin = in.nextInt();
        while (pin < 1000 || pin > 9999) {
            System.out.print("Invalid PIN, try again: ");
            pin = in.nextInt();
        }

        activeAccount = bank.createAccount(pin, new User(firstName, lastName));
        bank.update(activeAccount);
        bank.save();

        System.out.println("\nThank you. Your account number is " + activeAccount.getAccountNo() + ".");
        System.out.println("Please login to access your newly created account.\n");
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
