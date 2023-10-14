/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javvproject;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance

        while (true) {
            System.out.println("ATM Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option (1/2/3/4): ");

            int choice = scanner.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    amount = scanner.nextDouble();
                    userAccount.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    amount = scanner.nextDouble();
                    userAccount.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}


