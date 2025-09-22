public class Main {
    public static void main(String[] args) {
        BankAccount sakshamAccount = new BankAccount("Saksham Gupta", "0123456789", 1000.00);

        sakshamAccount.displayAccountDetails();
        sakshamAccount.deposit(2000);
        sakshamAccount.displayAccountDetails();
        sakshamAccount.withdraw(200);
        sakshamAccount.displayAccountDetails();
        sakshamAccount.withdraw(500);
        sakshamAccount.displayAccountDetails();

    }
}