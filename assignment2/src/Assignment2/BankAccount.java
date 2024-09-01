package Assignment2;

import java.util.Scanner;

public class BankAccount {
    private double balance;

   
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance must be greater than 0.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); 

        BankAccount account = new BankAccount(initialBalance);

        boolean continueOperations = true;
        while (continueOperations) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                 
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); 
                    account.deposit(depositAmount);
                    break;
                case 2:
                 
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();  
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:

                    account.displayBalance();
                    break;
                case 4:
                  
                    continueOperations = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (continueOperations) {
           
                System.out.print("\nDo you want to perform another operation? (yes/no): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    continueOperations = false;
                }
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
