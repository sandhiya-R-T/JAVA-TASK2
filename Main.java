package OOPSinJava;

import java.util.Scanner;

class Account {
        private double balance;

        public Account() {
        balance = 0.0;
    }

        public Account(double initialBalance) {
        balance = initialBalance;
    }

        public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

        public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                Account account1 = new Account();
        	System.out.println("Account 1 created with default balance.");

               System.out.print("Enter initial balance for Account 2: $");
        	double initialBalance = scanner.nextDouble();
       	 Account account2 = new Account(initialBalance);
        	System.out.println("Account 2 created with initial balance: $" + initialBalance);

                account1.deposit(100.0);
        	account1.withdraw(50.0);

               account2.deposit(200.0);
        	account2.withdraw(300.0);

               account1.displayBalance();
        	account2.displayBalance();

        scanner.close();
    }
}
