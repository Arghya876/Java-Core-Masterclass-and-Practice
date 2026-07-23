/**
 * 02-object-oriented-programming: EncapsulationDemo.java
 * ========================================================
 * 💡 What is Encapsulation? (Beginner Friendly Guide)
 * ---------------------------------------------------
 * Analogy: A Capsule / Medicine Pill 💊
 * Encapsulation means bundling variables (data) and methods (actions) inside a single class,
 * and hiding variables by making them `private`.
 *
 * Why hide data? 
 * So nobody can illegally tamper with sensitive data (like setting bank balance = -$999999).
 * Access is given through Getters (to read) and Setters (to update safely).
 */

class BankAccount {
    // Private variable: CANNOT be accessed directly from outside this class!
    private String accountHolder;
    private double balance;

    // Constructor: Sets up the account when created
    public BankAccount(String holder, double initialDeposit) {
        this.accountHolder = holder;
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial deposit! Balance set to $0.");
        }
    }

    // Getter Method: Safe read access
    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter / Action Method: Safe deposit with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Setter / Action Method: Safe withdraw with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrew $" + amount + ". Remaining Balance: $" + balance);
        } else {
            System.out.println("❌ Withdrawal denied! Insufficient funds or invalid amount.");
        }
    }
}

public class Step02_EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      Encapsulation Demo (Bank Account)   ");
        System.out.println("=========================================");

        BankAccount acc = new BankAccount("Arghya", 500.0);

        System.out.println("Account Holder : " + acc.getAccountHolder());
        System.out.println("Initial Balance: $" + acc.getBalance());

        // Trying to deposit money safely
        acc.deposit(250.0);

        // Trying to withdraw money safely
        acc.withdraw(100.0);

        // Trying to withdraw more money than available
        acc.withdraw(1000.0);

        System.out.println("=========================================");
    }
}
