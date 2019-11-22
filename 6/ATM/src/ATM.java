import java.io.IOException;
import java.util.Scanner;

public class ATM {
    
    private Scanner in;
    private BankAccount activeAccount;
    private Bank bank;
    
    // public static final int VIEW = 1;
    // public static final int DEPOSIT = 2;
    // public static final int WITHDRAW = 3;
    // public static final int TRANSFER = 4;
    // public static final int LOGOUT = 5;

    public static final int FIRST_NAME_WIDTH = 20;
    public static final int LAST_NAME_WIDTH = 30;
    
    enum Transaction {
        VIEW(1),
        DEPOSIT(2),
        WITHDRAW(3),
        TRANSFER(4),
        LOGOUT(5);

        int option;
        Transaction(int o) {
            option = o;
        }
        int getOption() {
            return option;
        }
    }
    
    enum TransStatus {
        INVALID,
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
                System.out.print("\nFirst name: ");
                String firstname = in.next();
                while (firstname.length() < 1 || firstname.length() > 20) {
                    System.out.print("Invalid name, try again: ");
                    firstname= in.next();
                }
                System.out.print("Last name: ");
                String lastname = in.next();
                while (lastname.length() < 1 || lastname.length() > 30) {
                    System.out.print("Invalid name, try again: ");
                    lastname= in.next();
                }
                System.out.print("PIN: ");
                int pin = in.nextInt();
                while (pin < 1000 || pin > 9999) {
                    System.out.print("Invalid PIN, try again: ");
                    pin = in.nextInt();
                }
                activeAccount = bank.createAccount(pin, new User(firstname, lastname));
                bank.update(activeAccount);
                bank.save();

                System.out.println("\nThank you. Your account number is " + activeAccount.getAccountNo() + ".");
                System.out.println("Please login to access your newly created account.\n");
                continue;
            }
            
            long accountNo = Long.parseLong(accountNoStr);
            
            System.out.print("PIN        : ");
            int pin = in.nextInt();

            activeAccount = bank.getAccount(accountNo);

            // if (accountNo == -1 && pin == -1) {
            //     shutdown();
            // }

            if (activeAccount != null && isValidLogin(accountNo, pin)) {
                activeAccount = bank.login(accountNo, pin);
                System.out.println("\nHello, again, " + activeAccount.getAccountHolder().getFirstName() + "!\n");
                
                boolean validLogin = true;
                while (validLogin) {
                    switch (getSelection()) {
                        case ATM.Transaction.VIEW.getOption():
                            showBalance();
                            break;
                        case ATM.Transaction.DEPOSIT.getOption():
                            deposit();
                            bank.update(activeAccount);
                            break;
                        case ATM.Transaction.WITHDRAW.getOption():
                            withdraw();
                            bank.update(activeAccount);
                            break;
                        case ATM.Transaction.TRANSFER.getOption():
                            transfer();
                            break;
                        case ATM.Transaction.LOGOUT.getOption():
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
        // if ()
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
        
        TransStatus status = activeAccount.deposit(amount);
        if (status == ATM.TransStatus.INVALID) {
            System.out.println("\nDeposit rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.TransStatus.EXCESSIVE) {
            System.out.println("\nDeposit rejected. Amount would cause balance to exceed $999,999,999,999.99");
        } else if (status == ATM.TransStatus.SUCCESS) {
            System.out.println("\nDeposit accepted.\n");
        }
    }
    
    public void withdraw() {
        System.out.print("\nEnter amount: ");
        double amount = in.nextDouble();
            
        TransStatus status = activeAccount.withdraw(amount);
        if (status == ATM.TransStatus.INVALID) {
            System.out.println("\nWithdrawal rejected. Amount must be greater than $0.00.\n");
        } else if (status == ATM.TransStatus.INSUFFICIENT) {
            System.out.println("\nWithdrawal rejected. Insufficient funds.\n");
        } else if (status == ATM.TransStatus.SUCCESS) {
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
            TransStatus status = activeAccount.transfer(amount, transferAccount);
            if (status == ATM.TransStatus.INVALID) {
                System.out.println("\nTransfer rejected. Amount must be greater than $0.00.\n");
            } else if (status == ATM.TransStatus.INSUFFICIENT) {
                System.out.println("\nTransfer rejected. Insufficient funds.\n");
            } else if (status == ATM.TransStatus.EXCESSIVE) {
                System.out.println("\nTransfer rejected. Amount would cause destination balance to exceed $999,999,999,999.99.\n");
            } else if (status == ATM.TransStatus.SUCCESS) {
                System.out.println("\nTransfer accepted.\n");
            }
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
