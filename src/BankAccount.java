public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if ( amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" + amount);
        } else {
            System.out.println("Deposited Amount Be Greater Than 0");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Successfully Withdrew: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient Funds!");
        } else {
            System.out.println("Withdrawal amount should be greater than 0 (zero)");
        }
    }

    public void displayAccountDetails(){
        System.out.println("\n--- Account Details ---\n");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance + "\n");
        System.out.println("\n------------------------\n");
    }

}

