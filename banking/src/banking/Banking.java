package banking;
import java.util.Scanner;

public class Banking {
    protected String name;
    protected int accountNumber;
    protected double balance;

    // Constructor
    public Banking(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: R" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: R" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for account details
        System.out.print("Enter Account Holder's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: R");
        double balance = scanner.nextDouble();

        // Create a new Banking account with user-provided data
        Banking account = new Banking(name, accountNumber, balance);

        // Test deposit and display balance
        System.out.print("Enter amount to deposit: R");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        account.displayBalance();
    }
}
