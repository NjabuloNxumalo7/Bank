/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

public class Checking extends Banking {
    private double overdraftLimit;

    public Checking(String name, int accountNumber, double balance, double overdraftLimit) {
        super(name, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: R" + amount);
        } else {
            System.out.println("Exceeds overdraft limit or invalid amount.");
        }
    }
}